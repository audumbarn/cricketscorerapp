/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.domain;

import java.util.Date;

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
@Table(name="csa_tbl_wicket")
public class Wicket {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String wicketId;
	
	//TODO add enum for this
	private int wicketType;
	
	private String batsmanId;
	
	private String deliveryId;
	private String overId;
	
	private String caughtByPlayerId;
	private String runOutByPlayerOne;
	private String runOutByPlayerTwo;
	private Date createdOn;
	private Date modifiedOn;
	
	/**
	 * @return the wicketId
	 */
	public String getWicketId() {
		return wicketId;
	}
	/**
	 * @param wicketId the wicketId to set
	 */
	public void setWicketId(String wicketId) {
		this.wicketId = wicketId;
	}
	/**
	 * @return the wicketType
	 */
	public int getWicketType() {
		return wicketType;
	}
	/**
	 * @param wicketType the wicketType to set
	 */
	public void setWicketType(int wicketType) {
		this.wicketType = wicketType;
	}
	/**
	 * @return the batsmanId
	 */
	public String getBatsmanId() {
		return batsmanId;
	}
	/**
	 * @param batsmanId the batsmanId to set
	 */
	public void setBatsmanId(String batsmanId) {
		this.batsmanId = batsmanId;
	}
	/**
	 * @return the deliveryId
	 */
	public String getDeliveryId() {
		return deliveryId;
	}
	/**
	 * @param deliveryId the deliveryId to set
	 */
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
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
	 * @return the caughtByPlayerId
	 */
	public String getCaughtByPlayerId() {
		return caughtByPlayerId;
	}
	/**
	 * @param caughtByPlayerId the caughtByPlayerId to set
	 */
	public void setCaughtByPlayerId(String caughtByPlayerId) {
		this.caughtByPlayerId = caughtByPlayerId;
	}
	/**
	 * @return the runOutByPlayerOne
	 */
	public String getRunOutByPlayerOne() {
		return runOutByPlayerOne;
	}
	/**
	 * @param runOutByPlayerOne the runOutByPlayerOne to set
	 */
	public void setRunOutByPlayerOne(String runOutByPlayerOne) {
		this.runOutByPlayerOne = runOutByPlayerOne;
	}
	/**
	 * @return the runOutByPlayerTwo
	 */
	public String getRunOutByPlayerTwo() {
		return runOutByPlayerTwo;
	}
	/**
	 * @param runOutByPlayerTwo the runOutByPlayerTwo to set
	 */
	public void setRunOutByPlayerTwo(String runOutByPlayerTwo) {
		this.runOutByPlayerTwo = runOutByPlayerTwo;
	}
	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the modifiedOn
	 */
	public Date getModifiedOn() {
		return modifiedOn;
	}
	/**
	 * @param modifiedOn the modifiedOn to set
	 */
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	
}
