/**
 * 
 */
package com.cricket.cricketscorerapp.wicket.domain;

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
	
	private String takenByPlayerId;
	
	//TODO add enum for this
	private int wicketType;
	
	private String batsmanId;
	
	private String deliveryId;
	private String overId;
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
	 * @return the takenByPlayerId
	 */
	public String getTakenByPlayerId() {
		return takenByPlayerId;
	}
	/**
	 * @param takenByPlayerId the takenByPlayerId to set
	 */
	public void setTakenByPlayerId(String takenByPlayerId) {
		this.takenByPlayerId = takenByPlayerId;
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
	
	
}
