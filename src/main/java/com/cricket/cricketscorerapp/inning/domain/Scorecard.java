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
	private Map<String, Batsman> batsmen;
	
	private int byes;
	private int legByes;
	private int wides;
	private int noballs;
	private int penaltyRuns;
	
	/**
	 * @return the byes
	 */
	public int getByes() {
		return byes;
	}
	/**
	 * @param byes the byes to set
	 */
	public void setByes(int byes) {
		this.byes = byes;
	}
	/**
	 * @return the legByes
	 */
	public int getLegByes() {
		return legByes;
	}
	/**
	 * @param legByes the legByes to set
	 */
	public void setLegByes(int legByes) {
		this.legByes = legByes;
	}
	/**
	 * @return the wides
	 */
	public int getWides() {
		return wides;
	}
	/**
	 * @param wides the wides to set
	 */
	public void setWides(int wides) {
		this.wides = wides;
	}
	/**
	 * @return the noballs
	 */
	public int getNoballs() {
		return noballs;
	}
	/**
	 * @param noballs the noballs to set
	 */
	public void setNoballs(int noballs) {
		this.noballs = noballs;
	}
	/**
	 * @return the penaltyRuns
	 */
	public int getPenaltyRuns() {
		return penaltyRuns;
	}
	/**
	 * @param penaltyRuns the penaltyRuns to set
	 */
	public void setPenaltyRuns(int penaltyRuns) {
		this.penaltyRuns = penaltyRuns;
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
	public Map<String, Batsman> getBatsmen() {
		return batsmen;
	}
	/**
	 * @param batsmen the batsmen to set
	 */
	public void setBatsmen(Map<String, Batsman> batsmen) {
		this.batsmen = batsmen;
	}
	
	
}
