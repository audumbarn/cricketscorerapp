/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.service;

import java.util.List;
import java.util.Optional;

import com.cricket.cricketscorerapp.tournament.domain.Tournament;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface TournamentService {
	
	public Tournament addTournament(Tournament tournament);
	
	public Optional<Tournament> getTournament(String tournamentId);
	
	public List<Tournament> getAllTournaments();
	
	public void updateTournament(Tournament tournament);	
}
