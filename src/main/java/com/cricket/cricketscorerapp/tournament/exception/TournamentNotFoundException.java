/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.exception;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class TournamentNotFoundException extends RuntimeException{
	
	public TournamentNotFoundException() {
		super(ExceptionMessageConstants.TOURNAMENT_NOT_FOUND_EXCEPTION_MSG);
	}
}
