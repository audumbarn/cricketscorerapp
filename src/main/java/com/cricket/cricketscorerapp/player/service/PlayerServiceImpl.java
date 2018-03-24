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
	public Optional<Player> getPlayerInfoById(String playerId) {
		return playerRepository.findById(playerId);
	}

	@Override
	public List<Player> getAllPlayersInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addPlayer(Player player) {
		player=playerRepository.save(player);
		return player.getPlayerId();
	}

}
