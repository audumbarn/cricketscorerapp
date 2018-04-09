/**
 * 
 */
package com.cricket.cricketscorerapp.player.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class PlayerNotFoundException extends RuntimeException {
	
	public PlayerNotFoundException() {
		super(ExceptionMessageConstants.PLAYER_NOT_FOUND_EXCEPTION_MSG);
	}
}
