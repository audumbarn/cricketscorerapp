/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.tournament.pojo.Tournament;
import com.cricket.cricketscorerapp.tournament.repository.TournamentRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class TournamentServiceImpl implements TournamentService{

	@Autowired
	TournamentRepository tournamentRepository;
	
	@Override
	public String addTournament(Tournament tournament) {
		return (tournamentRepository.save(tournament)).getTournamentId();
	}

	@Override
	public Optional<Tournament> getTournament(String tournamentId) {
		return tournamentRepository.findById(tournamentId);
	}

	
	@Override
	public List<Tournament> getAllTournaments() {
		return tournamentRepository.findAll();
	}

	@Override
	public void updateTournament(Tournament tournament) {
		tournamentRepository.save(tournament);
	}

}
