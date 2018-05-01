/**
 * 
 */
package com.cricket.cricketscorerapp.tournamentsetting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.tournamentsetting.service.TournamentSettingService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/tournamentsetting")
public class TournamentSettingController {

	@Autowired
	TournamentSettingService tournamentSettingService;
}
