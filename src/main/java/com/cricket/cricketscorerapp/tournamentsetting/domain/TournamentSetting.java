/**
 * 
 */
package com.cricket.cricketscorerapp.tournamentsetting.domain;

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
@Table(name="csa_tbl_tournament_setting")
public class TournamentSetting {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String tournamentSettingId;
	
	private int maxOvers;
	private int powerplayOvers;
	private int lbw;
	private int wideRuns;
	private int noBallRuns;
	private int freeHit;
	private int maxOversPerBowler;
	public String getTournamentSettingId() {
		return tournamentSettingId;
	}
	public void setTournamentSettingId(String tournamentSettingId) {
		this.tournamentSettingId = tournamentSettingId;
	}
	public int getMaxOvers() {
		return maxOvers;
	}
	public void setMaxOvers(int maxOvers) {
		this.maxOvers = maxOvers;
	}
	public int getPowerplayOvers() {
		return powerplayOvers;
	}
	public void setPowerplayOvers(int powerplayOvers) {
		this.powerplayOvers = powerplayOvers;
	}
	public int getLbw() {
		return lbw;
	}
	public void setLbw(int lbw) {
		this.lbw = lbw;
	}
	public int getWideRuns() {
		return wideRuns;
	}
	public void setWideRuns(int wideRuns) {
		this.wideRuns = wideRuns;
	}
	public int getNoBallRuns() {
		return noBallRuns;
	}
	public void setNoBallRuns(int noBallRuns) {
		this.noBallRuns = noBallRuns;
	}
	public int getFreeHit() {
		return freeHit;
	}
	public void setFreeHit(int freeHit) {
		this.freeHit = freeHit;
	}
	public int getMaxOversPerBowler() {
		return maxOversPerBowler;
	}
	public void setMaxOversPerBowler(int maxOversPerBowler) {
		this.maxOversPerBowler = maxOversPerBowler;
	}
	
}
