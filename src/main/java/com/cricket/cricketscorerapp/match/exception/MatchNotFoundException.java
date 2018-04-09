/**
 * 
 */
package com.cricket.cricketscorerapp.match.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class MatchNotFoundException extends RuntimeException {

	public MatchNotFoundException() {
		super(ExceptionMessageConstants.MATCH_NOT_FOUND_EXCEPTION_MSG);
	}
}
