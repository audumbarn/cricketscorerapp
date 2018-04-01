/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.tournament.pojo.Tournament;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface TournamentRepository extends JpaRepository<Tournament, String> {

}
