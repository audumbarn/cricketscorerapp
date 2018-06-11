/**
 * 
 */
package com.cricket.cricketscorerapp.inning.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.delivery.domain.Delivery;
import com.cricket.cricketscorerapp.delivery.service.DeliveryService;
import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.domain.Scorecard;
import com.cricket.cricketscorerapp.inning.repository.InningRepository;
import com.cricket.cricketscorerapp.over.domain.Over;
import com.cricket.cricketscorerapp.over.service.OverService;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class InningServiceImpl implements InningService {

	@Autowired
	InningRepository inningRepository;
	
	@Autowired
	OverService overService;
	
	@Autowired
	DeliveryService deliveryService;
	
	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.inning.service.InningService#addInning(com.cricket.cricketscorerapp.inning.domain.Inning)
	 */
	@Override
	public Inning addInning(Inning inning) {
		return inningRepository.save(inning);
	}

	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.inning.service.InningService#getInning(java.lang.String)
	 */
	@Override
	public Optional<Inning> getInning(String inningId) {
		return inningRepository.findById(inningId);
	}

	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.inning.service.InningService#getAllInnings()
	 */
	@Override
	public List<Inning> getMatchInnings(String matchId) {
		return inningRepository.findByMatchId(matchId);
	}

	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.inning.service.InningService#getScorecard(java.lang.String)
	 */
	@Override
	public Scorecard getScorecard(String inningId) {
		Scorecard card = new Scorecard();
		
		List<Over> overs = overService.getOvers(inningId);
		List<Delivery> allDeliveries = deliveryService.getAllDeliveries(inningId);
		Map<String, Integer> batsmen = new HashMap<String, Integer>();
		int total = 0;
		//calculate runs
		for(Delivery delivery: allDeliveries) {
			/*perform check for delivery type & then take action
			 * Actions can be: Add score to batsmen, add to total, add to extras etc
			 */
			
			String batsmanId = delivery.getRunsScoredByPlayerId();
			int runsScored = delivery.getRunsScored();
			
			total = total + runsScored;
			if(batsmen.get(batsmanId) != null) {
				batsmen.put(batsmanId, batsmen.get(batsmanId)+runsScored);
			} else {
				batsmen.put(batsmanId, +runsScored);
			}
			card.setInningId(inningId); //Not required though
			card.setBatsmen(batsmen);
			card.setTotal(total);
		}
		return card;
	}

}
