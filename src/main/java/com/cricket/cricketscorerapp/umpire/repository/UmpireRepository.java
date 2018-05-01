/**
 * 
 */
package com.cricket.cricketscorerapp.umpire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.umpire.domain.Umpire;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface UmpireRepository extends JpaRepository<Umpire, String> {

}
