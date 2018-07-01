/**
 * 
 */
package com.cricket.cricketscorerapp.inning.domain;

import com.cricket.cricketscorerapp.wicket.domain.Wicket;

/**
 * @author Audumbar Nevarekar
 *
 */
public class Batsman {
	private String batsmanId;
	private int runs;
	private int deliveries;
	private int fours;
	private int sixes;
	private Wicket wicket;
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
	 * @return the runs
	 */
	public int getRuns() {
		return runs;
	}
	/**
	 * @param runs the runs to set
	 */
	public void setRuns(int runs) {
		this.runs = runs;
	}
	/**
	 * @return the deliveries
	 */
	public int getDeliveries() {
		return deliveries;
	}
	/**
	 * @param deliveries the deliveries to set
	 */
	public void setDeliveries(int deliveries) {
		this.deliveries = deliveries;
	}
	/**
	 * @return the fours
	 */
	public int getFours() {
		return fours;
	}
	/**
	 * @param fours the fours to set
	 */
	public void setFours(int fours) {
		this.fours = fours;
	}
	/**
	 * @return the sixes
	 */
	public int getSixes() {
		return sixes;
	}
	/**
	 * @param sixes the sixes to set
	 */
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	/**
	 * @return the wicket
	 */
	public Wicket getWicket() {
		return wicket;
	}
	/**
	 * @param wicket the wicket to set
	 */
	public void setWicket(Wicket wicket) {
		this.wicket = wicket;
	}
	
	
}
