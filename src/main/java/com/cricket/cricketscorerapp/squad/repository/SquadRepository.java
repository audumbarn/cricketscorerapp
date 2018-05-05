/**
 * 
 */
package com.cricket.cricketscorerapp.squad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.squad.domain.Squad;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface SquadRepository extends JpaRepository<Squad, String> {

	List<Squad> findByTeamId(String teamId);
}
