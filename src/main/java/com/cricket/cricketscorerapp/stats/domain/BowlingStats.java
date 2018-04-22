package com.cricket.cricketscorerapp.stats.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="csa_tbl_bowling_stats")
public class BowlingStats {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String bowlingStatsId;
	
	private int inningsPlayed;
	private int deliveries;
	private int runsGiven;
	private int wicketsTaken;
	
	public String getBowlingStatsId() {
		return bowlingStatsId;
	}
	public void setBowlingStatsId(String bowlingStatsId) {
		this.bowlingStatsId = bowlingStatsId;
	}
	public int getInningsPlayed() {
		return inningsPlayed;
	}
	public void setInningsPlayed(int inningsPlayed) {
		this.inningsPlayed = inningsPlayed;
	}
	public int getDeliveries() {
		return deliveries;
	}
	public void setDeliveries(int deliveries) {
		this.deliveries = deliveries;
	}
	public int getRunsGiven() {
		return runsGiven;
	}
	public void setRunsGiven(int runsGiven) {
		this.runsGiven = runsGiven;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	
}
