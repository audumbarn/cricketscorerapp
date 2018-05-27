/**
 * 
 */
package com.cricket.cricketscorerapp.over.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.over.domain.Over;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface OverRepository extends JpaRepository<Over, String> {

	public List<Over> findByInningId(String overId); 
}
