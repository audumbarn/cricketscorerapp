/**
 * 
 */
package com.cricket.cricketscorerapp.core.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cricket.cricketscorerapp.inning.exception.InningNotFoundException;
import com.cricket.cricketscorerapp.match.exception.MatchNotFoundException;
import com.cricket.cricketscorerapp.player.exception.PlayerNotFoundException;
import com.cricket.cricketscorerapp.team.exception.TeamNotFoundException;
import com.cricket.cricketscorerapp.tournament.exception.TeamAlreadyExistsException;
import com.cricket.cricketscorerapp.tournament.exception.TournamentNotFoundException;

/**
 * @author Audumbar Nevarekar
 *
 */
@RestControllerAdvice
public class GlobalControllerAdvice {

	
	private static final Logger log = LoggerFactory.getLogger(GlobalControllerAdvice.class);

	@ExceptionHandler({TournamentNotFoundException.class, InningNotFoundException.class,
		MatchNotFoundException.class, PlayerNotFoundException.class, TeamNotFoundException.class})
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public VndErrors notFoundException(final Exception e) {
		log.error(e.getMessage());
		String logref = e.getClass().getSimpleName();
		String msg = e.getMessage();
		
		return new VndErrors(logref,msg);
	}
	
	@ExceptionHandler({TeamAlreadyExistsException.class})
	@ResponseStatus(value=HttpStatus.CONFLICT)
	public VndErrors alreadyExistsException(final Exception e) {
		log.error(e.getMessage());
		String logref = e.getClass().getSimpleName();
		String msg = e.getMessage();
		
		return new VndErrors(logref,msg);
	}
}
