/**
 * 
 */
package com.cricket.cricketscorerapp.inning.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity(name="cs_tbl_inning")
public class Inning {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String inningId;
	
	//TODO Mark this as foreign key
	private String matchId;
	
	private String battingTeamId;
	private String bowlingTeamId;
	private int runsScored;
	private int wickets;
	private int oversBowled;
	private int deliveriesBowled;
	
	//TODO add enum
	private int inningStatus;
	//TODO add enum
	private int endedBy;
	/**
	 * @return the inningId
	 */
	public String getInningId() {
		return inningId;
	}
	/**
	 * @param inningId the inningId to set
	 */
	public void setInningId(String inningId) {
		this.inningId = inningId;
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
	/**
	 * @return the battingTeamId
	 */
	public String getBattingTeamId() {
		return battingTeamId;
	}
	/**
	 * @param battingTeamId the battingTeamId to set
	 */
	public void setBattingTeamId(String battingTeamId) {
		this.battingTeamId = battingTeamId;
	}
	/**
	 * @return the bowlingTeamId
	 */
	public String getBowlingTeamId() {
		return bowlingTeamId;
	}
	/**
	 * @param bowlingTeamId the bowlingTeamId to set
	 */
	public void setBowlingTeamId(String bowlingTeamId) {
		this.bowlingTeamId = bowlingTeamId;
	}
	/**
	 * @return the runsScored
	 */
	public int getRunsScored() {
		return runsScored;
	}
	/**
	 * @param runsScored the runsScored to set
	 */
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	/**
	 * @return the wickets
	 */
	public int getWickets() {
		return wickets;
	}
	/**
	 * @param wickets the wickets to set
	 */
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	/**
	 * @return the oversBowled
	 */
	public int getOversBowled() {
		return oversBowled;
	}
	/**
	 * @param oversBowled the oversBowled to set
	 */
	public void setOversBowled(int oversBowled) {
		this.oversBowled = oversBowled;
	}
	/**
	 * @return the deliveriesBowled
	 */
	public int getDeliveriesBowled() {
		return deliveriesBowled;
	}
	/**
	 * @param deliveriesBowled the deliveriesBowled to set
	 */
	public void setDeliveriesBowled(int deliveriesBowled) {
		this.deliveriesBowled = deliveriesBowled;
	}
	/**
	 * @return the inningStatus
	 */
	public int getInningStatus() {
		return inningStatus;
	}
	/**
	 * @param inningStatus the inningStatus to set
	 */
	public void setInningStatus(int inningStatus) {
		this.inningStatus = inningStatus;
	}
	/**
	 * @return the endedBy
	 */
	public int getEndedBy() {
		return endedBy;
	}
	/**
	 * @param endedBy the endedBy to set
	 */
	public void setEndedBy(int endedBy) {
		this.endedBy = endedBy;
	}
	
	
}
