/**
 * 
 */
package com.cricket.cricketscorerapp.playingeleven.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cricket.cricketscorerapp.playingeleven.domain.PlayingEleven;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface PlayingElevenRepository extends JpaRepository<PlayingEleven, String> {

	@Query("select pe from PlayingEleven pe where pe.matchId = ?1 AND pe.teamId = ?2")
	public List<PlayingEleven> getPlayingEleven(String matchId, String teamId);
}
