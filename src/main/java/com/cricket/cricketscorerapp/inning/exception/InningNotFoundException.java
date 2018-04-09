/**
 * 
 */
package com.cricket.cricketscorerapp.inning.exception;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class InningNotFoundException extends RuntimeException{

	public InningNotFoundException() {
		super(ExceptionMessageConstants.INNING_NOT_FOUND_EXCEPTION_MSG);
	}
}
