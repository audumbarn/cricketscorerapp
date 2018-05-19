/**
 * 
 */
package com.cricket.cricketscorerapp.squad.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.cricket.cricketscorerapp.player.domain.Player;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity
@Table(name="csa_tbl_squad")
public class Squad {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String squadId;
	
	private String teamId;
	
	/*@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="playerId")
	private Player player;*/
	
	//TODO Decide to use mapping or not
	/*Using Hibernate's Object mappping(Foregin key) is useful for getting whole object
	 * But I'm not happy with it returning complete data. Makes Squad object bulky.*/
	private String playerId;

	/**
	 * @return the squadId
	 */
	public String getSquadId() {
		return squadId;
	}

	/**
	 * @param squadId the squadId to set
	 */
	public void setSquadId(String squadId) {
		this.squadId = squadId;
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
	 * @return the player
	 
	public Player getPlayer() {
		return player;
	}

	 * @param player the player to set
	 
	public void setPlayer(Player player) {
		this.player = player;
	}
	*/
}
