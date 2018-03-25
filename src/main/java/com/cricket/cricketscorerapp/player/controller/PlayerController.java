package com.cricket.cricketscorerapp.player.controller;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.player.pojo.Player;
import com.cricket.cricketscorerapp.player.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addPlayer(@RequestBody Player p) {
		Player player = new Player(p.getFirstName(), p.getLastName(),new Date(), (UUID.randomUUID().toString()));
		return playerService.addPlayer(player);
	}
	
	@RequestMapping(value="/get/{playerId}", method=RequestMethod.GET)
	public Optional<Player> getPlayerInfo(@PathVariable("playerId") String playerId){
		return playerService.getPlayerInfoById(playerId);
	}
}
