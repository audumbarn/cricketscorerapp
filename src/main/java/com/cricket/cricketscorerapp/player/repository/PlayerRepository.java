package com.cricket.cricketscorerapp.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.player.pojo.Player;

public interface PlayerRepository extends JpaRepository<Player, String> {

}
