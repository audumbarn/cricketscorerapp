package com.cricket.cricketscorerapp.player.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.player.pojo.Player;
import com.cricket.cricketscorerapp.player.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public Optional<Player> getPlayer(String playerId) {
		return playerRepository.findById(playerId);
	}

	@Override
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	@Override
	public String addPlayer(Player player) {
		return (playerRepository.save(player)).getPlayerId();
	}

}
