/**
 * 
 */
package com.cricket.cricketscorerapp.player.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Audumbar Nevarekar
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class PlayerNotFoundException extends RuntimeException {
	
	public PlayerNotFoundException(String exception) {
		super(exception);
	}
}
