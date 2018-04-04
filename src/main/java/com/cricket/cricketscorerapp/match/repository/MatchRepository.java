/**
 * 
 */
package com.cricket.cricketscorerapp.match.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.match.pojo.Match;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface MatchRepository extends JpaRepository<Match, String> {

}
