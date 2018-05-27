/**
 * 
 */
package com.cricket.cricketscorerapp.match.controller;

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

import com.cricket.cricketscorerapp.inning.domain.Inning;
import com.cricket.cricketscorerapp.inning.service.InningService;
import com.cricket.cricketscorerapp.match.domain.Match;
import com.cricket.cricketscorerapp.match.exception.MatchNotFoundException;
import com.cricket.cricketscorerapp.match.service.MatchService;
import com.cricket.cricketscorerapp.player.domain.Player;
import com.cricket.cricketscorerapp.playingeleven.domain.PlayingEleven;
import com.cricket.cricketscorerapp.playingeleven.service.PlayingElevenService;

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
	
	@Autowired
	InningService inningService;
	
	@Autowired
	PlayingElevenService playingElevenService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Match> addMatch(@RequestBody Match match) {
		return new ResponseEntity<Match>(matchService.addMatch(match), HttpStatus.CREATED);
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
	
	@RequestMapping(value="/{matchId}/innings", method=RequestMethod.GET)
	public List<Inning> getMatchInnings(@PathVariable("matchId") String matchId) {
		return inningService.getMatchInnings(matchId);
	}
	
	//creates 2 innings for the match, sets STATUS to started
	@RequestMapping(value="/start", method=RequestMethod.PUT)
	public void startMatch(@RequestBody Match match) {
		matchService.startMatch(match);
	}
	
	//Add playing eleven to the team for match
	@RequestMapping(value="/{matchId}/{teamId}/playingeleven", method=RequestMethod.POST)
	public void addPlayingEleven(@PathVariable("matchId") String matchId, @PathVariable("teamId") String teamId,
			@RequestBody List<Player> players) {
		playingElevenService.addPlayers(matchId, teamId, players);
	}
	
	@RequestMapping(value="/{matchId}/{teamId}/playingeleven", method=RequestMethod.GET)
	public List<PlayingEleven> getPlayingEleven(@PathVariable("matchId") String matchId, @PathVariable("teamId") String teamId) {
		return playingElevenService.getPlayingEleven(matchId, teamId);
	}
}
