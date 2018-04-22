package com.cricket.cricketscorerapp.player.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.player.domain.Player;

public interface PlayerService {

	public Optional<Player> getPlayer(String playerId);
	
	public List<Player> getAllPlayers();
	
	public String addPlayer(Player player);
}
