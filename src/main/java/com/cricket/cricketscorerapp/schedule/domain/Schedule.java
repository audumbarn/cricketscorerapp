/**
 * 
 */
package com.cricket.cricketscorerapp.schedule.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity
@Table(name="csa_tbl_schedule")
public class Schedule {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String scheduleId;
	
	private String tournamentId;
	private String matchId;
	/**
	 * @return the scheduleId
	 */
	public String getScheduleId() {
		return scheduleId;
	}
	/**
	 * @param scheduleId the scheduleId to set
	 */
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	/**
	 * @return the tournamentId
	 */
	public String getTournamentId() {
		return tournamentId;
	}
	/**
	 * @param tournamentId the tournamentId to set
	 */
	public void setTournamentId(String tournamentId) {
		this.tournamentId = tournamentId;
	}
	/**
	 * @return the matchId
	 */
	public String getMatchId() {
		return matchId;
	}
	/**
	 * @param matchId the matchId to set
	 */
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	
}
