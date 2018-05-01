/**
 * 
 */
package com.cricket.cricketscorerapp.tournamentsetting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.tournamentsetting.repository.TournamentSettingRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class TournamentSettingServiceImpl implements TournamentSettingService {

	@Autowired
	TournamentSettingRepository tournamentSettingRepository;
}
