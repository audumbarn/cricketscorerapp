/**
 * 
 */
package com.cricket.cricketscorerapp.delivery.util;

/**
 * @author Audumbar Nevarekar
 *
 */
public enum RunsEnum {
	REGULAR(0),
	LEGBYES(1),
	BYES(2),
	PENALTY(3);
	
	private int type;
	
	RunsEnum(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
}
