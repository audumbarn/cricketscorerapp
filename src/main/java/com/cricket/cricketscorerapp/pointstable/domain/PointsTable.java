/**
 * 
 */
package com.cricket.cricketscorerapp.pointstable.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity(name="csa_tbl_points_table")
public class PointsTable {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String pointsTableId;
	
	private int matchesPlayed;
	private int matchesWon;
	private int matchesLost;
	private int noResult;
	private int points;
	private double netRunRate;
	private String teamId;
	private String tournamentId;
	/**
	 * @return the pointsTableId
	 */
	public String getPointsTableId() {
		return pointsTableId;
	}
	/**
	 * @param pointsTableId the pointsTableId to set
	 */
	public void setPointsTableId(String pointsTableId) {
		this.pointsTableId = pointsTableId;
	}
	/**
	 * @return the matchesPlayed
	 */
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	/**
	 * @param matchesPlayed the matchesPlayed to set
	 */
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	/**
	 * @return the matchesWon
	 */
	public int getMatchesWon() {
		return matchesWon;
	}
	/**
	 * @param matchesWon the matchesWon to set
	 */
	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}
	/**
	 * @return the matchesLost
	 */
	public int getMatchesLost() {
		return matchesLost;
	}
	/**
	 * @param matchesLost the matchesLost to set
	 */
	public void setMatchesLost(int matchesLost) {
		this.matchesLost = matchesLost;
	}
	/**
	 * @return the noResult
	 */
	public int getNoResult() {
		return noResult;
	}
	/**
	 * @param noResult the noResult to set
	 */
	public void setNoResult(int noResult) {
		this.noResult = noResult;
	}
	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	/**
	 * @return the netRunRate
	 */
	public double getNetRunRate() {
		return netRunRate;
	}
	/**
	 * @param netRunRate the netRunRate to set
	 */
	public void setNetRunRate(double netRunRate) {
		this.netRunRate = netRunRate;
	}
	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}
	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	/**
	 * @return the tournamentId
	 */
	public String getTournamentId() {
		return tournamentId;
	}
	/**
	 * @param tournamentId the tournamentId to set
	 */
	public void setTournamentId(String tournamentId) {
		this.tournamentId = tournamentId;
	}
	
	
}
