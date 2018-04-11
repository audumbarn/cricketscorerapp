/**
 * 
 */
package com.cricket.cricketscorerapp.team.exception;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class TeamNotFoundException extends RuntimeException {

	public TeamNotFoundException() {
		super(ExceptionMessageConstants.TEAM_NOT_FOUND_EXCEPTION_MSG);
	}
}
