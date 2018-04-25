/**
 * 
 */
package com.cricket.cricketscorerapp.playingeleven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.cricketscorerapp.playingeleven.repository.PlayingElevenRepository;

/**
 * @author Audumbar Nevarekar
 *
 */
@Service
public class PlayingElevenServiceImpl implements PlayingElevenService {

	@Autowired
	PlayingElevenRepository playingElevenRepository;
}
