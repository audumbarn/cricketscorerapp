/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.wicket.domain.Wicket;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface WicketRepository extends JpaRepository<Wicket, String>{

}
