/**
 * 
 */
package com.cricket.cricketscorerapp.inning.domain;

import java.util.Map;

/**
 * @author Audumbar Nevarekar
 *
 */
public class Scorecard {
	private String inningId;
	private int total;
	private int wickets;
	private int overs;
	private int deliveries;
	private Map<String, Integer> batsmen;
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
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
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
	 * @return the overs
	 */
	public int getOvers() {
		return overs;
	}
	/**
	 * @param overs the overs to set
	 */
	public void setOvers(int overs) {
		this.overs = overs;
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
	 * @return the batsmen
	 */
	public Map<String, Integer> getBatsmen() {
		return batsmen;
	}
	/**
	 * @param batsmen the batsmen to set
	 */
	public void setBatsmen(Map<String, Integer> batsmen) {
		this.batsmen = batsmen;
	}
	
	
}
