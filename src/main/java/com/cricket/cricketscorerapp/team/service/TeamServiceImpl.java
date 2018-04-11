/**
 * 
 */
package com.cricket.cricketscorerapp.team.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.team.pojo.Team;
import com.cricket.cricketscorerapp.team.repository.TeamRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	TeamRepository teamRepository;
	
	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.team.service.TeamService#addTeam(com.cricket.cricketscorerapp.team.pojo.Team)
	 */
	@Override
	public String addTeam(Team team) {
		return (teamRepository.save(team)).getTeamId();
	}

	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.team.service.TeamService#getTeam(java.lang.String)
	 */
	@Override
	public Optional<Team> getTeam(String teamId) {
		return teamRepository.findById(teamId);
	}

	/* (non-Javadoc)
	 * @see com.cricket.cricketscorerapp.team.service.TeamService#getAllTeams()
	 */
	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

}
