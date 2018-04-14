/**
 * 
 */
package com.cricket.cricketscorerapp.team.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity(name="csa_tbl_team")
public class Team {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String teamId;
	
	private String teamName;
	private String ownerName;
	private String captainName;
	private String coachName;
	private int archived;
	
	//
	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}
	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the captainName
	 */
	public String getCaptainName() {
		return captainName;
	}
	/**
	 * @param captainName the captainName to set
	 */
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	/**
	 * @return the coachName
	 */
	public String getCoachName() {
		return coachName;
	}
	/**
	 * @param coachName the coachName to set
	 */
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	/**
	 * @return the archived
	 */
	public int getArchived() {
		return archived;
	}
	/**
	 * @param archived the archived to set
	 */
	public void setArchived(int archived) {
		this.archived = archived;
	}
}
