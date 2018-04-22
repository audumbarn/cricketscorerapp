/**
 * 
 */
package com.cricket.cricketscorerapp.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.team.domain.Team;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface TeamRepository extends JpaRepository<Team, String> {

}
