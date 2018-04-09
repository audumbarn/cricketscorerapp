/**
 * 
 */
package com.cricket.cricketscorerapp.inning.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.inning.pojo.Inning;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface InningService {

	public String addInning(Inning inning);
	
	public Optional<Inning> getInning(String inningId);
	
	public List<Inning> getAllInnings();
}