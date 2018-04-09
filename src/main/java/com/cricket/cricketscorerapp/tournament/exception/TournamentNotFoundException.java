/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TournamentNotFoundException extends RuntimeException{
	
	public TournamentNotFoundException() {
		super(ExceptionMessageConstants.TOURNAMENT_NOT_FOUND_EXCEPTION_MSG);
	}
}
