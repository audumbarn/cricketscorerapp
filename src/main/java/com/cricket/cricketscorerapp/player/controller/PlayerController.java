package com.cricket.cricketscorerapp.player.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.player.exception.PlayerNotFoundException;
import com.cricket.cricketscorerapp.player.pojo.Player;
import com.cricket.cricketscorerapp.player.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addPlayer(@RequestBody Player p) {
		return playerService.addPlayer(p);
	}
	
	@RequestMapping(value="/get/{playerId}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Player>> getPlayer(@PathVariable("playerId") String playerId){
		Optional<Player> player = playerService.getPlayer(playerId);
		if(!player.isPresent()) {
			throw new PlayerNotFoundException("Player Not Found");
		}
		return ResponseEntity.ok(player);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();
	}
}
