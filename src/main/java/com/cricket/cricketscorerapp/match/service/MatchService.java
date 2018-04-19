/**
 * 
 */
package com.cricket.cricketscorerapp.match.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.match.pojo.Match;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface MatchService {
	public void addMatch(Match match);
	
	public Optional<Match> getMatch(String matchId);
	
	public List<Match> getAllMatches();

	public List<Match> getAllMatchesInATournament(String tournamentId);

}
