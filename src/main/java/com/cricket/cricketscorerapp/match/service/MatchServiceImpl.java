/**
 * 
 */
package com.cricket.cricketscorerapp.match.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.match.pojo.Match;
import com.cricket.cricketscorerapp.match.repository.MatchRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class MatchServiceImpl implements MatchService{

	@Autowired
	MatchRepository matchReository;
	
	@Override
	public void addMatch(Match match) {
		matchReository.save(match);
	}

	@Override
	public Optional<Match> getMatch(String matchId) {
		return matchReository.findById(matchId);
	}

	@Override
	public List<Match> getAllMatches() {
		return matchReository.findAll();
	}

}
