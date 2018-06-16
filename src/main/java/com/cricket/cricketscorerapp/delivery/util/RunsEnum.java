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
	WIDES(1),
	LEGBYES(2),
	BYES(3);
	
	private int type;
	
	RunsEnum(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
}
