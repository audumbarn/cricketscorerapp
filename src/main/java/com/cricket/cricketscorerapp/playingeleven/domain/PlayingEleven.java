/**
 * 
 */
package com.cricket.cricketscorerapp.playingeleven.domain;

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
@Table(name="csa_tbl_playing_eleven")
public class PlayingEleven {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String playingElevenId;
	
	private String matchId;
	private String playerId;
	private String teamId;
	
	//Addiing all match scores here. This will help to keep track of score
	
	/*private int battingStatus;	//DNB,NOTOUT,OUT
	private int runs;
	private int balls;
	private int ones;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;*/
	
	
	/**
	 * @return the playingElevenId
	 */
	public String getPlayingElevenId() {
		return playingElevenId;
	}
	/**
	 * @param playingElevenId the playingElevenId to set
	 */
	public void setPlayingElevenId(String playingElevenId) {
		this.playingElevenId = playingElevenId;
	}
	/**
	 * @return the matchId
	 */
	public String getMatchId() {
		return matchId;
	}
	/**
	 * @param matchId the matchId to set
	 */
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}
	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
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
	
	
}
