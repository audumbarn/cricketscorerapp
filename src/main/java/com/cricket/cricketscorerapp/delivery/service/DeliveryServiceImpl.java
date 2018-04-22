/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.delivery.repository.DeliveryRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	DeliveryRepository deliveryRepository;
}
