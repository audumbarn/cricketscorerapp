/**
 * 
 */
package com.cricket.cricketscorerapp.umpire.domain;

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
@Table(name="csa_tbl_umpire")
public class Umpire {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String umpireId;
	
	private String umpireName;
	private String mobileNumber;
	private Date dateOfBirth;
	private int matchesUmpired;
	/**
	 * @return the umpireId
	 */
	public String getUmpireId() {
		return umpireId;
	}
	/**
	 * @param umpireId the umpireId to set
	 */
	public void setUmpireId(String umpireId) {
		this.umpireId = umpireId;
	}
	/**
	 * @return the umpireName
	 */
	public String getUmpireName() {
		return umpireName;
	}
	/**
	 * @param umpireName the umpireName to set
	 */
	public void setUmpireName(String umpireName) {
		this.umpireName = umpireName;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the matchesUmpired
	 */
	public int getMatchesUmpired() {
		return matchesUmpired;
	}
	/**
	 * @param matchesUmpired the matchesUmpired to set
	 */
	public void setMatchesUmpired(int matchesUmpired) {
		this.matchesUmpired = matchesUmpired;
	}
	
}
