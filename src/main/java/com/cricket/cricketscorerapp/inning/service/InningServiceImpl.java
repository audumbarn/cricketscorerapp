/**
 * 
 */
package com.cricket.cricketscorerapp.inning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.repository.InningRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class InningServiceImpl implements InningService {

	@Autowired
	InningRepository inningRepository;
	
	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.inning.service.InningService#addInning(com.cricket.cricketscorerapp.inning.domain.Inning)
	 */
	@Override
	public String addInning(Inning inning) {
		return (inningRepository.save(inning)).getInningId();
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

}
