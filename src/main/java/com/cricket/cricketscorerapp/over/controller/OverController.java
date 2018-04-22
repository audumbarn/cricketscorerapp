/**
 * 
 */
package com.cricket.cricketscorerapp.over.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.cricketscorerapp.over.service.OverService;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestController
@RequestMapping("/over")
public class OverController {

	@Autowired
	OverService overService;
}
