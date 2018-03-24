package com.cricket.cricketscorerapp.player.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.player.pojo.Player;

public interface PlayerService {

	public Optional<Player> getPlayerInfoById(String playerId);
	public List<Player> getAllPlayersInfo();
	public String addPlayer(Player player);
}
