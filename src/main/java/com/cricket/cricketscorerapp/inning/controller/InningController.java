/**
 * 
 */
package com.cricket.cricketscorerapp.inning.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.domain.Scorecard;
import com.cricket.cricketscorerapp.inning.exception.InningNotFoundException;
import com.cricket.cricketscorerapp.inning.service.InningService;
import com.cricket.cricketscorerapp.over.domain.Over;
import com.cricket.cricketscorerapp.over.service.OverService;

/**
 * @author Audumbar Nevarekar
 *
 */

@RestController
@RequestMapping("/inning")
public class InningController {

	@Autowired
	InningService inningService;
	
	@Autowired
	OverService overService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Inning> addInning(@RequestBody Inning inning) throws URISyntaxException {
		return new ResponseEntity<Inning>(inningService.addInning(inning), HttpStatus.CREATED);
	} 
	
	@RequestMapping(value="/{inningId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Inning>> getInning(@PathVariable("inningId") String inningId) {
		Optional<Inning> inning = inningService.getInning(inningId);
		if(!inning.isPresent()){
			throw new InningNotFoundException();
		}
		return ResponseEntity.ok().body(inning);
	}
	
	@RequestMapping(value="/{inningId}/over", method=RequestMethod.GET)
	public List<Over> getOvers(@PathVariable("inningId") String inningId) {
		return overService.getOvers(inningId);
	}
	
	//TODO change return type to scorecard object
	@RequestMapping(value="/{inningId}/scorecard", method=RequestMethod.GET)
	public Scorecard getScorecard(@PathVariable("inningId") String inningId) {
		return inningService.getScorecard(inningId);
	}
}
