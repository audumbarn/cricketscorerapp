/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.service;

import java.util.List;

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
	public void addTournament(Tournament tournament) {
		tournamentRepository.save(tournament);
		
	}

	@Override
	public Tournament getTournament(String tournamentId) {
		return tournamentRepository.getOne(tournamentId);
	}

	
	@Override
	public List<Tournament> getAllTournaments() {
		// TODO Auto-generated method stub
		return null;
	}

}
