package com.cricket.cricketscorerapp.player.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.player.domain.Player;
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
	public Player addPlayer(Player player) {
		return playerRepository.save(player);
	}

	@Override
	public List<Player> getAllPlayersInATeam(String teamId) {
		return playerRepository.findByTeamId(teamId);
	}

}
