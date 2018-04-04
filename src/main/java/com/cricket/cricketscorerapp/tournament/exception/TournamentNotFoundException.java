/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Audumbar Nevarekar
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TournamentNotFoundException extends RuntimeException{
	
	public TournamentNotFoundException(String exception) {
		super(exception);
	}
}
