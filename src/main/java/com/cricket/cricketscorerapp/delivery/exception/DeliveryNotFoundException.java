/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.exception;

import com.cricket.cricketscorerapp.util.ExceptionMessageConstants;

/**
 * @author Audumbar Nevarekar
 *
 */
public class DeliveryNotFoundException extends RuntimeException{

	public DeliveryNotFoundException() {
		super(ExceptionMessageConstants.DELIVERY_NOT_FOUND_EXCEPTION_MSG);
	}
}
