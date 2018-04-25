/**
 * 
 */
package com.cricket.cricketscorerapp.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.schedule.domain.Schedule;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface ScheduleRepository extends JpaRepository<Schedule, String> {

}
