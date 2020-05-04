package com;

//Singleton class
//Eagerly initialized static instance guarantees thread safety.
public final class PresidentEager { 
	
	//Private constructor so nobody can instantiate the class.
    private PresidentEager() {
    	
    }	
    
    //Static instance of the class
    private static final PresidentEager INSTANCE= new PresidentEager();

    //No public constructor, so only way to get object is to call the this method.
    //This method caches the first created object and returns it in all subsequent calls.
	public static PresidentEager getInstance() {
		return INSTANCE;
	}
    
    

}
