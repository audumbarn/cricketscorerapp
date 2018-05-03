/**
 * 
 */
package com.cricket.cricketscorerapp.over.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.over.domain.Over;
import com.cricket.cricketscorerapp.over.exception.OverNotFoundException;
import com.cricket.cricketscorerapp.over.service.OverService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/over")
public class OverController {

	@Autowired
	OverService overService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String addOver(@RequestBody Over over) {
		return overService.addOver(over);
	}
	
	@RequestMapping(value="/{overId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Over>> getOver(@PathVariable("overId") String overId) {
		Optional<Over> over = overService.getOver(overId);
		if(!over.isPresent()){
			throw new OverNotFoundException();
		}
		return ResponseEntity.ok().body(over);
	}
}
