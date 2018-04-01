/**
 * 
 */
package com.cricket.cricketscorerapp.stats.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Audumbar Nevarekar
 *
 */
@Entity(name="csa_tbl_fielding_stats")
public class FieldingStats {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String fieldingStatsId;
	
	private int catchesTaken;
	private int stumpings;
	private int runouts;
	
	public String getFieldingStatsId() {
		return fieldingStatsId;
	}
	public void setFieldingStatsId(String fieldingStatsId) {
		this.fieldingStatsId = fieldingStatsId;
	}
	public int getCatchesTaken() {
		return catchesTaken;
	}
	public void setCatchesTaken(int catchesTaken) {
		this.catchesTaken = catchesTaken;
	}
	public int getStumpings() {
		return stumpings;
	}
	public void setStumpings(int stumpings) {
		this.stumpings = stumpings;
	}
	/**
	 * @return the runouts
	 */
	public int getRunouts() {
		return runouts;
	}
	/**
	 * @param runouts the runouts to set
	 */
	public void setRunouts(int runouts) {
		this.runouts = runouts;
	}
	
	
}
