package com;

public class PresidentThreadSafeSimple {

	//Static Member
	private static PresidentThreadSafeSimple INSTANCE =null;
	
	//private constructor
	private PresidentThreadSafeSimple() {
		
	}
	
	//Static synchronized method
	//Only one thread can execute at a time
	public static synchronized PresidentThreadSafeSimple getInstance() {
		if (INSTANCE==null) {
			//if no instance available, then create new one
			INSTANCE= new PresidentThreadSafeSimple();
		}
		
		return INSTANCE;
	}
		
	
}
