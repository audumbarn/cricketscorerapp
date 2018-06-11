/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.service;

import java.util.List;
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
	
	//get all delivery info to build scorecard for an inning
	List<Delivery> getAllDeliveries(String inningId);
}
