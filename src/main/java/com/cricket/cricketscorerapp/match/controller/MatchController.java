/**
 * 
 */
package com.cricket.cricketscorerapp.match.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.match.pojo.Match;
import com.cricket.cricketscorerapp.match.service.MatchService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	MatchService matchService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addMatch(@RequestBody Match match) {
		matchService.addMatch(match);
	}
	
	@RequestMapping(value="/get/{matchId}", method=RequestMethod.GET)
	public Match getMatch(@PathVariable("matchId") String matchId) {
		return matchService.getMatch(matchId);
	}
}
