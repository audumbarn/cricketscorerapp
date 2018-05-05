/**
 * 
 */
package com.cricket.cricketscorerapp.squad.service;

import java.util.List;

import com.cricket.cricketscorerapp.squad.domain.Squad;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface SquadService {

	String addPlayerToSqaud(Squad squad);
	
	List<Squad> getAllPlayersInATeam(String teamId);
	
	void removePlayer(Squad squad);
}
