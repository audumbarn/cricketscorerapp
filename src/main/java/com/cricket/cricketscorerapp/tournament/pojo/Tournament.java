/**
 * 
 */
package com.cricket.cricketscorerapp.tournament.pojo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.cricket.cricketscorerapp.tournamentsetting.pojo.TournamentSetting;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity(name="csa_tbl_tournament")
public class Tournament {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String tournamentId;
	
	private String tournamentName;
	private Date startDate;
	private Date endDate;
	private String organisedBy;
	private String winnerId;
	private int archived;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "tournamentSettingId")
	private TournamentSetting tournamentSetting;
	
	public String getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(String tournamentId) {
		this.tournamentId = tournamentId;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getOrganisedBy() {
		return organisedBy;
	}
	public void setOrganisedBy(String organisedBy) {
		this.organisedBy = organisedBy;
	}
	public String getWinnerId() {
		return winnerId;
	}
	public void setWinnerId(String winnerId) {
		this.winnerId = winnerId;
	}
	public int getArchived() {
		return archived;
	}
	public void setArchived(int archived) {
		this.archived = archived;
	}
	public TournamentSetting getTournamentSetting() {
		return tournamentSetting;
	}
	public void setTournamentSetting(TournamentSetting tournamentSetting) {
		this.tournamentSetting = tournamentSetting;
	}
	
	
	
}