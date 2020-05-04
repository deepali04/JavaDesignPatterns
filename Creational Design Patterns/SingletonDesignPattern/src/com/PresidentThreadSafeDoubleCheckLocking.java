package com;

public class PresidentThreadSafeDoubleCheckLocking {
	
	//Static Attribute
	private static PresidentThreadSafeDoubleCheckLocking INSTANCE =null;
	
	//Private Constructor
	private PresidentThreadSafeDoubleCheckLocking() {
		
	}
	
	//Static method
	//double check locking principle
	public static PresidentThreadSafeDoubleCheckLocking getInstance() {
		//if no instance available, then create new one
		if (INSTANCE==null) {
			// To provide thread-safe implementation.
			synchronized (PresidentThreadSafeDoubleCheckLocking.class) {
			// Check again as multiple threads can reach above step.
			if (INSTANCE==null) {					
				INSTANCE = new PresidentThreadSafeDoubleCheckLocking();
			}	
		}
	}
	return INSTANCE;
	}

}
