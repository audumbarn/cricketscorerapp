/**
 * 
 */
package com.cricket.cricketscorerapp.over;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class OverNotFoundException extends RuntimeException{
	
	public OverNotFoundException() {
		super(ExceptionMessageConstants.OVER_NOT_FOUND_EXCEPTION_MSG);
	}

}
