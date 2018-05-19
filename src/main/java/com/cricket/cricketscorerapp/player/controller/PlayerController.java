package com.cricket.cricketscorerapp.player.controller;

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

import com.cricket.cricketscorerapp.player.domain.Player;
import com.cricket.cricketscorerapp.player.exception.PlayerNotFoundException;
import com.cricket.cricketscorerapp.player.service.PlayerService;

@RestController
@RequestMapping("/player")
@CrossOrigin
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Player> addPlayer(@RequestBody Player p) {
		return new ResponseEntity<Player>(playerService.addPlayer(p), HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{playerId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Player>> getPlayer(@PathVariable("playerId") String playerId){
		Optional<Player> player = playerService.getPlayer(playerId);
		if(!player.isPresent()) {
			throw new PlayerNotFoundException();
		}
		return ResponseEntity.ok(player);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();
	}
}
