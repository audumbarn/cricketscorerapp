/**
 * 
 */
package com.cricket.cricketscorerapp.tournamentsetting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.cricketscorerapp.tournamentsetting.domain.TournamentSetting;

/**
 * @author Audumbar Nevarekar
 *
 */
public interface TournamentSettingRepository extends JpaRepository<TournamentSetting, String> {

}
