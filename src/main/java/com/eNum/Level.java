package com.eNum;

public enum Level {
    HIGH(1),
    MEDIUM(2),
    LOW(3);
	int i;

	Level(int i) {
		this.i =i;
	}
    
	   public int getLevel() {
		      return i;
		   }
}