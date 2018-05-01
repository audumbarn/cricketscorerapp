/**
 * 
 */
package com.cricket.cricketscorerapp.tournamentsetting.exception;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class TournamentSettingNotFoundException extends RuntimeException {

	public TournamentSettingNotFoundException() {
		super(ExceptionMessageConstants.TOURNAMENT_SETTING_NOT_FOUND_EXCEPTION_MSG);
	}
}
