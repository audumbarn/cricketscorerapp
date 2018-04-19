/**
 * 
 */
package com.cricket.cricketscorerapp.match.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cricket.cricketscorerapp.match.pojo.Match;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface MatchRepository extends JpaRepository<Match, String> {

	/**
	 * @param tournamentId
	 * @return
	 */
	@Query()
	List<Match> findByTournamentId(String tournamentId);

}
