/**
 * 
 */
package com.cricket.cricketscorerapp.over.service;

import java.util.Optional;

import com.cricket.cricketscorerapp.over.domain.Over;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface OverService {

	String addOver(Over over);
	
	Optional<Over> getOver(String overId);
	
	void updateOver(Over over);
}
