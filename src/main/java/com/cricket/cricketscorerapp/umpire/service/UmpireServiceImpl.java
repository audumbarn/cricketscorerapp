/**
 * 
 */
package com.cricket.cricketscorerapp.umpire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.umpire.repository.UmpireRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class UmpireServiceImpl implements UmpireService {
	
	@Autowired
	UmpireRepository umpireRepository;
}
