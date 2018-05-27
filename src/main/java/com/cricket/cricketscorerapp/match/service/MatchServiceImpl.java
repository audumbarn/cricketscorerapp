/**
 * 
 */
package com.cricket.cricketscorerapp.match.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.repository.InningRepository;
import com.cricket.cricketscorerapp.match.domain.Match;
import com.cricket.cricketscorerapp.match.repository.MatchRepository;
import com.cricket.cricketscorerapp.match.util.MatchConstants;;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class MatchServiceImpl implements MatchService{

	private static final Logger logger = LoggerFactory.getLogger(MatchServiceImpl.class);
	@Autowired
	MatchRepository matchReository;
	
	@Autowired
	InningRepository inningRepository;
	
	@Override
	public Match addMatch(Match match) {
		return matchReository.save(match);
	}

	@Override
	public Optional<Match> getMatch(String matchId) {
		return matchReository.findById(matchId);
	}

	@Override
	public List<Match> getAllMatches() {
		return matchReository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.match.service.MatchService#getAllMatchesInATournament(java.lang.String)
	 */
	@Override
	public List<Match> getAllMatchesInATournament(String tournamentId) {
		return matchReository.findByTournamentId(tournamentId);
	}

	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.match.service.MatchService#startMatch(com.cricket.cricketscorerapp.match.domain.Match)
	 */
	@Override
	public void startMatch(Match match) {
		// TODO Auto-generated method stub
		Match m = matchReository.save(match);
		if(m.getMatchStatus() == MatchConstants.STARTED) {
			Inning firstInning = new Inning();
			Inning secondInning = new Inning();
			
			firstInning.setMatchId(m.getMatchId());
			secondInning.setMatchId(m.getMatchId());
			
			String tossWinId = m.getTossWinTeamId();
			int decision = m.getDecision();
			if(decision == MatchConstants.BAT ) {
				firstInning.setBattingTeamId(tossWinId);
				firstInning.setBowlingTeamId((!tossWinId.equals( m.getTeamOneId())) ? m.getTeamOneId(): m.getTeamTwoId());
				logger.info("Batting: "+tossWinId+"\tBowling: "+((!tossWinId.equals( m.getTeamOneId())) ? m.getTeamOneId(): m.getTeamTwoId()));
				secondInning.setBattingTeamId((!tossWinId.equals( m.getTeamOneId())) ? m.getTeamOneId(): m.getTeamTwoId());
				secondInning.setBowlingTeamId(tossWinId);
			}
			else {
				firstInning.setBowlingTeamId(tossWinId);
				firstInning.setBattingTeamId((!tossWinId.equals( m.getTeamOneId())) ? m.getTeamOneId(): m.getTeamTwoId());
				
				secondInning.setBattingTeamId(tossWinId);
				secondInning.setBowlingTeamId((!tossWinId.equals( m.getTeamOneId())) ? m.getTeamOneId(): m.getTeamTwoId());
			}
			
			inningRepository.save(firstInning);
			inningRepository.save(secondInning);
		}
	}
}
