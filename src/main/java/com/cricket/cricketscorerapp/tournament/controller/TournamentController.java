/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.match.domain.Match;
import com.cricket.cricketscorerapp.match.service.MatchService;
import com.cricket.cricketscorerapp.team.domain.Team;
import com.cricket.cricketscorerapp.tournament.domain.Tournament;
import com.cricket.cricketscorerapp.tournament.exception.TeamAlreadyExistsException;
import com.cricket.cricketscorerapp.tournament.exception.TournamentNotFoundException;
import com.cricket.cricketscorerapp.tournament.service.TournamentService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/tournament")
@CrossOrigin
public class TournamentController {

	@Autowired
	TournamentService tournamentService;
	
	@Autowired
	MatchService matchService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Tournament> addTournament(@RequestBody Tournament tournament) {
		//Sending status as 201 created
		return new ResponseEntity<Tournament>(tournamentService.addTournament(tournament), HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{tournamentId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Tournament>> getTournament(@PathVariable("tournamentId") String tournamentId) {
		Optional<Tournament> tournament = tournamentService.getTournament(tournamentId);
		if(!tournament.isPresent()){
			throw new TournamentNotFoundException();
		}
		return ResponseEntity.ok().body(tournament);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Tournament> getAllTournaments() {
		return tournamentService.getAllTournaments();
	}
	
	//Adding an already created team to the tournament
	@RequestMapping(value="/{tournamentId}/team", method=RequestMethod.PUT)
	public void addTournamentTeam(@PathVariable("tournamentId") String tournamentId,@RequestBody Team team) {
		Optional<Tournament> tournament = tournamentService.getTournament(tournamentId);
		if(!tournament.isPresent()){
			throw new TournamentNotFoundException();
		}
		else if((tournament.get().getTeams()).contains(team)) {
			throw new TeamAlreadyExistsException();
		}
		else{
			tournament.get().addTeam(team);
			tournamentService.updateTournament(tournament.get());
		}
		
	}
	
	//Get all matches for a tournament
	@RequestMapping(value="/{tournamentId}/matches", method=RequestMethod.GET)
	public List<Match> getAllMatchesInATournament(@PathVariable("tournamentId")String tournamentId) {
		return matchService.getAllMatchesInATournament(tournamentId);		
	}
	
	//TO DO Check whether to provide teams through tournament object or here as well
	@RequestMapping(value="/{tournamentId}/team", method=RequestMethod.GET)
	public List<Team> getAllTeamsInATournament(@PathVariable("tournamentId") String tournamentId) {
		return null;
	}
}
