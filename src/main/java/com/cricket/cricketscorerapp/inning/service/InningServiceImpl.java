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
import com.cricket.cricketscorerapp.delivery.util.DeliveryEnum;
import com.cricket.cricketscorerapp.delivery.util.RunsEnum;
import com.cricket.cricketscorerapp.inning.domain.Batsman;
import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.domain.Scorecard;
import com.cricket.cricketscorerapp.inning.repository.InningRepository;
import com.cricket.cricketscorerapp.over.domain.Over;
import com.cricket.cricketscorerapp.over.service.OverService;
import com.cricket.cricketscorerapp.wicket.domain.Wicket;
import com.cricket.cricketscorerapp.wicket.service.WicketService;

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
	
	@Autowired
	WicketService wicketService;
	
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
		Map<String, Batsman> batsmen = new HashMap<String, Batsman>();
		int total = 0;
		int extras = 0;
		int wides = 0;
		int deliveriesBowled = 0;
		int noballs = 0;
		int byes = 0;
		int legByes = 0;
		int penalty = 0;
		//calculate runs
		for(Delivery delivery: allDeliveries) {
			/*perform check for delivery type & then take action
			 * Actions can be: Add score to batsmen, add to total, add to extras etc
			 */
			int runsScored = delivery.getRunsScored();
			Batsman currentBatsman = null;
			
			if(delivery.getDeliveryType() == DeliveryEnum.LEGAL || delivery.getDeliveryType() == DeliveryEnum.NOBALL) {
				String batsmanId = delivery.getRunsScoredByPlayerId();
				
				
				if(batsmen.get(batsmanId) != null) {
					currentBatsman = batsmen.get(batsmanId);
				}
				else {
					currentBatsman = new Batsman();
					currentBatsman.setBatsmanId(batsmanId);
				}
				currentBatsman.setDeliveries(currentBatsman.getDeliveries()+1);
				if(delivery.getDeliveryType() == DeliveryEnum.LEGAL) {
					deliveriesBowled++;
					
				}
				
				if(delivery.getDeliveryType() == DeliveryEnum.NOBALL) {
					noballs++;
				}
				//runs scored from bat, should be added to batsman & bowler
				if(delivery.getRunsType() == RunsEnum.REGULAR.getType()) {
					
					total = total + runsScored;
					
					if(runsScored == 4) {
						currentBatsman.setFours(currentBatsman.getFours()+1);
					}
					else if(runsScored == 6) {
						currentBatsman.setSixes(currentBatsman.getSixes()+1);
					}
					currentBatsman.setRuns(currentBatsman.getRuns()+runsScored);
					batsmen.put(batsmanId, currentBatsman);
					
				}
				else if(delivery.getRunsType() == RunsEnum.LEGBYES.getType()) {
					legByes = legByes+runsScored;
				}
				else if(delivery.getRunsType() == RunsEnum.BYES.getType()) {
					byes = byes+runsScored;
				}
				else if(delivery.getRunsType() == RunsEnum.PENALTY.getType()) {
					penalty = penalty+runsScored;
				}
				
				
			}
			else if(delivery.getDeliveryType() == DeliveryEnum.WIDE) {
				//This assumes we add a run for wide
				wides = wides +runsScored;
			}
			
			if(delivery.getWicketId() != null) {
				Wicket wicket = wicketService.getWicket(delivery.getWicketId());
				currentBatsman.setWicket(wicket);
			}
		}
		
		card.setWides(wides);
		card.setByes(byes);
		card.setLegByes(legByes);
		card.setNoballs(noballs);
		card.setPenaltyRuns(penalty);
		
		extras = wides+noballs+legByes+byes+penalty;
		total = total + extras;
		
		card.setOvers(deliveriesBowled/6);
		card.setDeliveries(deliveriesBowled%6);
		card.setInningId(inningId); //Not required though
		card.setBatsmen(batsmen);
		card.setTotal(total);
		
		return card;
	}

}
