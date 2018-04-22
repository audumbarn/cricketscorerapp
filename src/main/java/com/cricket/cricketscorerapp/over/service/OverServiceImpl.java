/**
 * 
 */
package com.cricket.cricketscorerapp.over.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.over.repository.OverRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class OverServiceImpl implements OverService {

	@Autowired
	OverRepository overRepository;
}
