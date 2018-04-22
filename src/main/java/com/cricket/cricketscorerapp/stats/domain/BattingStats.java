package com.cricket.cricketscorerapp.stats.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="csa_tbl_batting_stats")
public class BattingStats {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String battingStatsId;
	
	private int inningsPlayed;
	private int notouts;
	private int runs;
	private int highestScore;
	private int ballsFaced;
	private int fours;
	private int sixes;
	public String getBattingStatsId() {
		return battingStatsId;
	}
	public void setBattingStatsId(String battingStatsId) {
		this.battingStatsId = battingStatsId;
	}
	public int getInningsPlayed() {
		return inningsPlayed;
	}
	public void setInningsPlayed(int inningsPlayed) {
		this.inningsPlayed = inningsPlayed;
	}
	public int getNotouts() {
		return notouts;
	}
	public void setNotouts(int notouts) {
		this.notouts = notouts;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	public int getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	
}
