package com.cricket.cricketscorerapp.player.pojo;

import java.util.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.cricket.cricketscorerapp.stats.pojo.BattingStats;
import com.cricket.cricketscorerapp.stats.pojo.BowlingStats;
import com.cricket.cricketscorerapp.stats.pojo.FieldingStats;

@Entity(name="csa_tbl_player")
public class Player {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String playerId;
	
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String teamId;
	private int matchesPlayed;

	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "battingStatsId")
	private BattingStats battingStats;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="bowlingStatsId")
	private BowlingStats bowlingStats;

	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="fieldingStatsId")
	private FieldingStats fieldingStats;
	
	private Player() {}

	public Player(String firstName, String lastName, Date dateOfBirth, String teamId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.teamId = teamId;
	}
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public BattingStats getBattingStats() {
		return battingStats;
	}

	public void setBattingStats(BattingStats battingStats) {
		this.battingStats = battingStats;
	}

	
	public BowlingStats getBowlingStats() {
		return bowlingStats;
	}

	public void setBowlingStats(BowlingStats bowlingStats) {
		this.bowlingStats = bowlingStats;
	}

	public FieldingStats getFieldingStats() {
		return fieldingStats;
	}

	public void setFieldingStats(FieldingStats fieldingStats) {
		this.fieldingStats = fieldingStats;
	}


	
}
