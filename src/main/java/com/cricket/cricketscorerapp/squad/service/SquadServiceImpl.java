/**
 * 
 */
package com.cricket.cricketscorerapp.squad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.squad.domain.Squad;
import com.cricket.cricketscorerapp.squad.repository.SquadRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class SquadServiceImpl implements SquadService {

	@Autowired
	private SquadRepository squadRepository;
	
	@Override
	public String addPlayerToSqaud(Squad squad) {
		return (squadRepository.save(squad)).getSquadId();
	}

	@Override
	public List<Squad> getAllPlayersInATeam(String teamId) {
		return squadRepository.findByTeamId(teamId);
	}

	@Override
	public void removePlayer(Squad squad) {
		squadRepository.delete(squad);
	}

}
