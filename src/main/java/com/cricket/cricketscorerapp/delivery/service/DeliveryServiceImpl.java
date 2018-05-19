/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.delivery.domain.Delivery;
import com.cricket.cricketscorerapp.delivery.repository.DeliveryRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	DeliveryRepository deliveryRepository;

	@Override
	public Delivery addDelivery(Delivery delivery) {
		return deliveryRepository.save(delivery);
	}

	@Override
	public Optional<Delivery> getDelivery(String deliveryId) {
		return deliveryRepository.findById(deliveryId);
	}

	@Override
	public void updateDelivery(Delivery delivery) {
		deliveryRepository.save(delivery);
	}
}
