/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.tournament.exception.TournamentNotFoundException;
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
	public String addTournament(@RequestBody Tournament tournament) {
		return tournamentService.addTournament(tournament);
	}
	
	@RequestMapping(value="/get/{tournamentId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Tournament>> getTournament(@PathVariable("tournamentId") String tournamentId) {
		Optional<Tournament> tournament = tournamentService.getTournament(tournamentId);
		if(!tournament.isPresent()){
			throw new TournamentNotFoundException("Tournament Not Found");
		}
		return ResponseEntity.ok().body(tournament);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<Tournament> getAllTournaments() {
		return tournamentService.getAllTournaments();
	}
}
