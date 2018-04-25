/**
 * 
 */
package com.cricket.cricketscorerapp.pointstable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.pointstable.domain.PointsTable;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface PointsTableRepository extends JpaRepository<PointsTable, String> {

}
