/**
 * 
 */
package com.cricket.cricketscorerapp.inning.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.exception.InningNotFoundException;
import com.cricket.cricketscorerapp.inning.service.InningService;

/**
 * @author Audumbar Nevarekar
 *
 */

@RestController
@RequestMapping("/inning")
public class InningController {

	@Autowired
	InningService inningService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String addInning(@RequestBody Inning inning) throws URISyntaxException {
		return inningService.addInning(inning);
	} 
	
	@RequestMapping(value="/{inningId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Inning>> getInning(@PathVariable("inningId") String inningId) {
		Optional<Inning> inning = inningService.getInning(inningId);
		if(!inning.isPresent()){
			throw new InningNotFoundException();
		}
		return ResponseEntity.ok().body(inning);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Inning> getAllInnings() {
		return inningService.getAllInnings();
		
	}
}
