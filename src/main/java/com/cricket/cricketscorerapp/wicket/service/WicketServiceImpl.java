/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.wicket.repository.WicketRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class WicketServiceImpl implements WicketService {

	@Autowired
	WicketRepository wicketRepository;
}
