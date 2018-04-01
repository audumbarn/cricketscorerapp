/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.tournament.pojo.Tournament;
import com.cricket.cricketscorerapp.tournament.service.TournamentService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/tournament")
public class TournamentController {

	@Autowired
	TournamentService tournamentService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addTournament(@RequestBody Tournament tournament) {
		tournamentService.addTournament(tournament);
	}
	
	@RequestMapping(value="/get/{tournamentId}", method=RequestMethod.GET)
	public Tournament getTournament(@PathVariable("tournamentId") String tournamentId) {
		return tournamentService.getTournament(tournamentId);
	}
}
