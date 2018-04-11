/**
 * 
 */
package com.cricket.cricketscorerapp.team.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.team.exception.TeamNotFoundException;
import com.cricket.cricketscorerapp.team.pojo.Team;
import com.cricket.cricketscorerapp.team.service.TeamService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/team")
@CrossOrigin
public class TeamController {

	@Autowired
	TeamService teamService;
	
	public String addTeam(@RequestBody Team team) {
		return teamService.addTeam(team);
	}
	
	@RequestMapping(value="/get/{team}", method=RequestMethod.GET)
	public ResponseEntity<Optional<Team>> getTeam(@PathVariable("teamId") String teamId) {
		Optional<Team> team = teamService.getTeam(teamId);
		if(!team.isPresent()){
			throw new TeamNotFoundException();
		}
		return ResponseEntity.ok().body(team);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<Team> getAllTeams() {
		return teamService.getAllTeams();
	}
}
