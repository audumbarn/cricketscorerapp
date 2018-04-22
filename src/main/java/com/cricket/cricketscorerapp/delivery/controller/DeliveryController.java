/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.delivery.service.DeliveryService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	@Autowired
	DeliveryService deliveryService;
}
