package com.creational.factory;

public abstract class Pasta {
	
	//Private instance variable
	private PastaType type=null;

	public PastaType getType() {
		return type;
	}

	public void setType(PastaType type) {
		this.type = type;
	}
	
	//Public Constructor
	public Pasta (PastaType type) {
		this.type=type;
		boilPasta();
	}
	
	
	private void boilPasta() {
		
		//Common method for all
		
	}
	
	//Subclass level method
	protected abstract void addSauces();
	
}
