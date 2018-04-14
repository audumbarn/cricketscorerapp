/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.exception;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class TeamAlreadyExistsException extends RuntimeException {

	public TeamAlreadyExistsException() {
		super(ExceptionMessageConstants.TEAM_ALREADY_EXISTS_EXCEPTION_MSG);
	}
}
