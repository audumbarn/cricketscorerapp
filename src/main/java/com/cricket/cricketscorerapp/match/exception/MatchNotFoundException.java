/**
 * 
 */
package com.cricket.cricketscorerapp.match.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Audumbar Nevarekar
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class MatchNotFoundException extends RuntimeException {

	public MatchNotFoundException(String exception) {
		super(exception);
	}
}
