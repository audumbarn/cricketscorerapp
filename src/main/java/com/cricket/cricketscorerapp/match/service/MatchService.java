/**
 * 
 */
package com.cricket.cricketscorerapp.match.service;

import com.cricket.cricketscorerapp.match.pojo.Match;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface MatchService {
	public void addMatch(Match match);
	
	public Match getMatch(String matchId);

}
