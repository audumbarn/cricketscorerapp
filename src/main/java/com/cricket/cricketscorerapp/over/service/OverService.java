/**
 * 
 */
package com.cricket.cricketscorerapp.over.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.over.domain.Over;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface OverService {

	Over addOver(Over over);
	
	Optional<Over> getOver(String overId);
	
	void updateOver(Over over);
	
	List<Over> getOvers(String inningId);
}
