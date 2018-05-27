/**
 * 
 */
package com.cricket.cricketscorerapp.playingeleven.service;

import java.util.List;

import com.cricket.cricketscorerapp.player.domain.Player;
import com.cricket.cricketscorerapp.playingeleven.domain.PlayingEleven;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface PlayingElevenService {
	public void addPlayers(String matchId, String teamId, List<Player> players);
	
	public List<PlayingEleven> getPlayingEleven(String matchId, String teamId);
}
