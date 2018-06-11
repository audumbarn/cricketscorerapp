/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.delivery.domain.Delivery;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface DeliveryRepository extends JpaRepository<Delivery, String> {

	List<Delivery> findByInningId(String inningId);
}
