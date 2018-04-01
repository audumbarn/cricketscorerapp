/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.service;

import java.util.List;

import com.cricket.cricketscorerapp.tournament.pojo.Tournament;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface TournamentService {
	public void addTournament(Tournament tournament);
	public Tournament getTournament(String tournamentId);
	public List<Tournament> getAllTournaments();
}
