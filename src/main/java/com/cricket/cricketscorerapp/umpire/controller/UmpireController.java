/**
 * 
 */
package com.cricket.cricketscorerapp.umpire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.umpire.service.UmpireService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/umpire")
public class UmpireController {
	
	@Autowired
	UmpireService umpireService;
}
