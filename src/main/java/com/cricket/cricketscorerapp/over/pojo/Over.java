/**
 * 
 */
package com.cricket.cricketscorerapp.over.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity(name="csa_tbl_over")
public class Over {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String overId;
	
	private int overNumber;
	
	private int powerplayOver;
	private int superOver;
	private int bonusOver;
	
	private Date startedAtTime;
	private Date endedAtTime;
	
	private String bowledByPlayerId;
	
	private String inningId;
	private String matchId;
	
	//TODO create enum for this
	private int overStatus;

	/**
	 * @return the overId
	 */
	public String getOverId() {
		return overId;
	}

	/**
	 * @param overId the overId to set
	 */
	public void setOverId(String overId) {
		this.overId = overId;
	}

	/**
	 * @return the overNumber
	 */
	public int getOverNumber() {
		return overNumber;
	}

	/**
	 * @param overNumber the overNumber to set
	 */
	public void setOverNumber(int overNumber) {
		this.overNumber = overNumber;
	}

	/**
	 * @return the powerplayOver
	 */
	public int getPowerplayOver() {
		return powerplayOver;
	}

	/**
	 * @param powerplayOver the powerplayOver to set
	 */
	public void setPowerplayOver(int powerplayOver) {
		this.powerplayOver = powerplayOver;
	}

	/**
	 * @return the superOver
	 */
	public int getSuperOver() {
		return superOver;
	}

	/**
	 * @param superOver the superOver to set
	 */
	public void setSuperOver(int superOver) {
		this.superOver = superOver;
	}

	/**
	 * @return the bonusOver
	 */
	public int getBonusOver() {
		return bonusOver;
	}

	/**
	 * @param bonusOver the bonusOver to set
	 */
	public void setBonusOver(int bonusOver) {
		this.bonusOver = bonusOver;
	}

	/**
	 * @return the startedAtTime
	 */
	public Date getStartedAtTime() {
		return startedAtTime;
	}

	/**
	 * @param startedAtTime the startedAtTime to set
	 */
	public void setStartedAtTime(Date startedAtTime) {
		this.startedAtTime = startedAtTime;
	}

	/**
	 * @return the endedAtTime
	 */
	public Date getEndedAtTime() {
		return endedAtTime;
	}

	/**
	 * @param endedAtTime the endedAtTime to set
	 */
	public void setEndedAtTime(Date endedAtTime) {
		this.endedAtTime = endedAtTime;
	}

	/**
	 * @return the bowledByPlayerId
	 */
	public String getBowledByPlayerId() {
		return bowledByPlayerId;
	}

	/**
	 * @param bowledByPlayerId the bowledByPlayerId to set
	 */
	public void setBowledByPlayerId(String bowledByPlayerId) {
		this.bowledByPlayerId = bowledByPlayerId;
	}

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
	 * @return the overStatus
	 */
	public int getOverStatus() {
		return overStatus;
	}

	/**
	 * @param overStatus the overStatus to set
	 */
	public void setOverStatus(int overStatus) {
		this.overStatus = overStatus;
	}
}
