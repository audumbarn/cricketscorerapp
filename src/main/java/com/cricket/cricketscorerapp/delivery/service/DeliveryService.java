/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.service;

import java.util.Optional;

import com.cricket.cricketscorerapp.delivery.domain.Delivery;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface DeliveryService {
	
	Delivery addDelivery(Delivery delivery);
	
	Optional<Delivery> getDelivery(String deliveryId);
	
	void updateDelivery(Delivery delivery);
}
