/**
 * 
 */
package com.cricket.cricketscorerapp.match.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity(name="csa_tbl_match")
public class Match {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String matchId;
	
	private String teamOneId;
	private String teamTwoId;
	private Date matchStartTime;
	private Date matchEndTime;
	private String tossWinTeamId;
	private int decision;
	private String matchWonBy;
	private String venue;
	private int matchStatus;
	private String matchLabel;
	private String matchGroup;
	
	private String umpireOneId;
	private String umpireTwoId;
	
	
	public String getMatchId() {
		return matchId;
	}
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	public String getTeamOneId() {
		return teamOneId;
	}
	public void setTeamOneId(String teamOneId) {
		this.teamOneId = teamOneId;
	}
	public String getTeamTwoId() {
		return teamTwoId;
	}
	public void setTeamTwoId(String teamTwoId) {
		this.teamTwoId = teamTwoId;
	}
	public Date getMatchStartTime() {
		return matchStartTime;
	}
	public void setMatchStartTime(Date matchStartTime) {
		this.matchStartTime = matchStartTime;
	}
	public Date getMatchEndTime() {
		return matchEndTime;
	}
	public void setMatchEndTime(Date matchEndTime) {
		this.matchEndTime = matchEndTime;
	}
	public String getTossWinTeamId() {
		return tossWinTeamId;
	}
	public void setTossWinTeamId(String tossWinTeamId) {
		this.tossWinTeamId = tossWinTeamId;
	}
	public int getDecision() {
		return decision;
	}
	public void setDecision(int decision) {
		this.decision = decision;
	}
	public String getMatchWonBy() {
		return matchWonBy;
	}
	public void setMatchWonBy(String matchWonBy) {
		this.matchWonBy = matchWonBy;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public int getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(int matchStatus) {
		this.matchStatus = matchStatus;
	}
	public String getMatchLabel() {
		return matchLabel;
	}
	public void setMatchLabel(String matchLabel) {
		this.matchLabel = matchLabel;
	}
	public String getMatchGroup() {
		return matchGroup;
	}
	public void setMatchGroup(String matchGroup) {
		this.matchGroup = matchGroup;
	}
	/**
	 * @return the umpireOneId
	 */
	public String getUmpireOneId() {
		return umpireOneId;
	}
	/**
	 * @param umpireOneId the umpireOneId to set
	 */
	public void setUmpireOneId(String umpireOneId) {
		this.umpireOneId = umpireOneId;
	}
	/**
	 * @return the umpireTwoId
	 */
	public String getUmpireTwoId() {
		return umpireTwoId;
	}
	/**
	 * @param umpireTwoId the umpireTwoId to set
	 */
	public void setUmpireTwoId(String umpireTwoId) {
		this.umpireTwoId = umpireTwoId;
	}
	
}
