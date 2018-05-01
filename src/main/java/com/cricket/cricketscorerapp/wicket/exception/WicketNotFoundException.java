/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.exception;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class WicketNotFoundException extends RuntimeException {
	
	public WicketNotFoundException() {
		super(ExceptionMessageConstants.WICKET_NOT_FOUND_EXCEPTION_MSG);
	}
}
