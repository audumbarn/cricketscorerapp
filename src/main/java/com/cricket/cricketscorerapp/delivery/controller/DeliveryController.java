/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.delivery.domain.Delivery;
import com.cricket.cricketscorerapp.delivery.exception.DeliveryNotFoundException;
import com.cricket.cricketscorerapp.delivery.service.DeliveryService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	private static final Logger log = LoggerFactory.getLogger(DeliveryController.class);
	
	@Autowired
	DeliveryService deliveryService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Delivery> addDelivery(@RequestBody Delivery delivery) {
		return new ResponseEntity<Delivery>(deliveryService.addDelivery(delivery), HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{deliveryId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Delivery>> getDelivery(@PathVariable String deliveryId){
		Optional<Delivery> delivery = deliveryService.getDelivery(deliveryId);
		if(!delivery.isPresent()) {
			throw new DeliveryNotFoundException();
		}
		return ResponseEntity.ok().body(delivery);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateDelivery(@RequestBody Delivery delivery) {
		deliveryService.addDelivery(delivery);
	}
}
