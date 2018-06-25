/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.wicket.domain.Wicket;
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
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Wicket> addWicket(@RequestBody Wicket wicket) throws URISyntaxException {
		return new ResponseEntity<Wicket>(wicketService.addWicket(wicket), HttpStatus.CREATED);
	} 
}
