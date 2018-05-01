/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.wicket.service.WicketService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/wicket")
public class WicketController {

	@Autowired
	WicketService wicketService;
}
