/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.domain;

import java.util.Date;

import javax.persistence.Column;
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
@Table(name="csa_tbl_delivery")
public class Delivery {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String deliveryId;
	
	//TODO mark this as FK
	private String overId;
	
	private int deliveryNumber;
	private int runsScored;
	
	//TODO create enum for this
	private int deliveryType;

	//TODO create enum for this
	private int runsType;
	
	//This is also a FK but not marked in the backend
	private String runsScoredByPlayerId;
	//This is also a FK but not marked in the backend
	private String wicketId;
	
	//TODO See if this can be auto generated with current time
	@Column(name="bowled_at_time", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date bowledAtTime;
	
	private int speed;
	private int freeHit;
	
	private String inningId;
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
	 * @return the deliveryNumber
	 */
	public int getDeliveryNumber() {
		return deliveryNumber;
	}
	/**
	 * @param deliveryNumber the deliveryNumber to set
	 */
	public void setDeliveryNumber(int deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
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
	 * @return the deliveryType
	 */
	public int getDeliveryType() {
		return deliveryType;
	}
	/**
	 * @param deliveryType the deliveryType to set
	 */
	public void setDeliveryType(int deliveryType) {
		this.deliveryType = deliveryType;
	}
	/**
	 * @return the runsType
	 */
	public int getRunsType() {
		return runsType;
	}
	/**
	 * @param runsType the runsType to set
	 */
	public void setRunsType(int runsType) {
		this.runsType = runsType;
	}
	/**
	 * @return the runsScoredByPlayerId
	 */
	public String getRunsScoredByPlayerId() {
		return runsScoredByPlayerId;
	}
	/**
	 * @param runsScoredByPlayerId the runsScoredByPlayerId to set
	 */
	public void setRunsScoredByPlayerId(String runsScoredByPlayerId) {
		this.runsScoredByPlayerId = runsScoredByPlayerId;
	}
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
	 * @return the bowledAtTime
	 */
	public Date getBowledAtTime() {
		return bowledAtTime;
	}
	/**
	 * @param bowledAtTime the bowledAtTime to set
	 */
	public void setBowledAtTime(Date bowledAtTime) {
		this.bowledAtTime = bowledAtTime;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the freeHit
	 */
	public int getFreeHit() {
		return freeHit;
	}
	/**
	 * @param freeHit the freeHit to set
	 */
	public void setFreeHit(int freeHit) {
		this.freeHit = freeHit;
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
	
}
