/**
 * 
 */
package com.cricket.cricketscorerapp.inning.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.domain.Scorecard;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface InningService {

	public Inning addInning(Inning inning);
	
	public Optional<Inning> getInning(String inningId);
	
	public List<Inning> getMatchInnings(String matchId);
	
	public Scorecard getScorecard(String inningId);
}
