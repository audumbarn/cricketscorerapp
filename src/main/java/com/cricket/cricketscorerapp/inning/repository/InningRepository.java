/**
 * 
 */
package com.cricket.cricketscorerapp.inning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.inning.domain.Inning;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface InningRepository extends JpaRepository<Inning, String> {

	
}
