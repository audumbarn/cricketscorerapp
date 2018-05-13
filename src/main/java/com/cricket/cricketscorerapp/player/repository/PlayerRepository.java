package com.cricket.cricketscorerapp.player.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.player.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, String> {

	public List<Player> findByTeamId(String teamId);
}
