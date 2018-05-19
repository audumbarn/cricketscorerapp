/**
 * 
 */
package com.cricket.cricketscorerapp.match.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.match.domain.Match;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface MatchService {
	public Match addMatch(Match match);
	
	public Optional<Match> getMatch(String matchId);
	
	public List<Match> getAllMatches();

	public List<Match> getAllMatchesInATournament(String tournamentId);

}
