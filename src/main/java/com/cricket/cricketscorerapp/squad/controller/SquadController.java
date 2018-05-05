/**
 * 
 */
package com.cricket.cricketscorerapp.squad.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.player.domain.Player;
import com.cricket.cricketscorerapp.player.service.PlayerService;
import com.cricket.cricketscorerapp.squad.domain.Squad;
import com.cricket.cricketscorerapp.squad.service.SquadService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/squad")
public class SquadController {

	@Autowired
	SquadService squadService;
	
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String addPlayerToSquad(@RequestBody Squad squad) {
		return squadService.addPlayerToSqaud(squad);
	}
	
	//This returns a list of players in a team(squad) instead of squad object
	@RequestMapping(value="/{teamId}", method=RequestMethod.GET)
	public ResponseEntity<List<Player>> getSquad(@PathVariable String teamId){
		List<Squad> squad = squadService.getAllPlayersInATeam(teamId);
		List<Player> players = new ArrayList<>();
		for(Squad s:squad) {
			Optional<Player> player = playerService.getPlayer(s.getPlayerId());
			if(player.isPresent()) {
				players.add(player.get());
			}
		}
		return ResponseEntity.ok().body(players);
	}
}
