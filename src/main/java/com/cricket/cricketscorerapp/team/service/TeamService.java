/**
 * 
 */
package com.cricket.cricketscorerapp.team.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.team.domain.Team;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface TeamService {

	public String addTeam(Team team);
	
	public Optional<Team> getTeam(String teamId);
	
	public List<Team> getAllTeams();
}
