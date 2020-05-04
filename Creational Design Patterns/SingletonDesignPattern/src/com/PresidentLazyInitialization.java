package com;

public class PresidentLazyInitialization {
	
	private static PresidentLazyInitialization instance = null;
	
	
	//Public constructor
	private PresidentLazyInitialization() {
		
	}

	public static PresidentLazyInitialization getINSTANCE() {
		
		//if no instance available, then create new one
		if(instance==null) {
			instance=new PresidentLazyInitialization();
			
		}
		return instance;
	}
	
	
	

}
