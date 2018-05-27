/**
 * 
 */
package com.cricket.cricketscorerapp.over.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.over.domain.Over;
import com.cricket.cricketscorerapp.over.repository.OverRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class OverServiceImpl implements OverService {

	@Autowired
	OverRepository overRepository;

	@Override
	public Over addOver(Over over) {
		return overRepository.save(over);
	}

	@Override
	public Optional<Over> getOver(String overId) {
		return overRepository.findById(overId);
	}
	
	@Override
	public void updateOver(Over over) {
		overRepository.save(over);
	}

	@Override
	public List<Over> getOvers(String inningId) {
		return overRepository.findByInningId(inningId);
	}
}
