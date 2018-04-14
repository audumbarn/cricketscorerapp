/**
 * 
 */
package com.cricket.cricketscorerapp.match.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.match.exception.MatchNotFoundException;
import com.cricket.cricketscorerapp.match.pojo.Match;
import com.cricket.cricketscorerapp.match.service.MatchService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/match")
@CrossOrigin
public class MatchController {

	@Autowired
	MatchService matchService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void addMatch(@RequestBody Match match) {
		matchService.addMatch(match);
	}
	
	@RequestMapping(value="/{matchId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Match>> getMatch(@PathVariable("matchId") String matchId) {
		Optional<Match> match = matchService.getMatch(matchId);
		if(!match.isPresent()) {
			throw new MatchNotFoundException();
		}
		
		return ResponseEntity.ok(match);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Match> getAllMatches() {
		return matchService.getAllMatches();
		
	}
}
