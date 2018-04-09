/**
 * 
 */
package com.cricket.cricketscorerapp.inning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.inning.pojo.Inning;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface InningRepository extends JpaRepository<Inning, String> {

	
}