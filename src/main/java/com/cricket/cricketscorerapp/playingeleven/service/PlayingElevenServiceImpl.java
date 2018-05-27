/**
 * 
 */
package com.cricket.cricketscorerapp.playingeleven.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.player.domain.Player;
import com.cricket.cricketscorerapp.playingeleven.domain.PlayingEleven;
import com.cricket.cricketscorerapp.playingeleven.repository.PlayingElevenRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class PlayingElevenServiceImpl implements PlayingElevenService {

	@Autowired
	PlayingElevenRepository playingElevenRepository;

	
	@Override
	public void addPlayers(String matchId, String teamId, List<Player> players) {
		Iterator<Player> itr = players.iterator();
		List<PlayingEleven> playingEleven = new ArrayList<PlayingEleven>();
		while(itr.hasNext()) {
			PlayingEleven playingElevenPlayer = new PlayingEleven();
			playingElevenPlayer.setMatchId(matchId);
			playingElevenPlayer.setTeamId(teamId);
			playingElevenPlayer.setPlayerId(itr.next().getPlayerId());
			
			playingEleven.add(playingElevenPlayer);
		}
		
		playingElevenRepository.saveAll(playingEleven);
		
	}


	@Override
	public List<PlayingEleven> getPlayingEleven(String matchId, String teamId) {
		return playingElevenRepository.getPlayingEleven(matchId, teamId);
	}
	
}
