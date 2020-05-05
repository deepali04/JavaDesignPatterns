package com.creational.abstractfactory;

public abstract class Pasta {
	
	//Private instance variable
	private PastaType type=null;
	private Style style=null;

	public PastaType getType() {
		return type;
	}

	public void setType(PastaType type) {
		this.type = type;
	}
	
	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	//Public Constructor
	public Pasta (PastaType type, Style style) {
		this.type=type;
		this.style=style;
		boilPasta();
	}
	
	
	private void boilPasta() {
		
		//Common method for all
		
	}
	
	@Override
	  public String toString() {
	    return "PastaType- "+type + " built in "+style;
	  }
	
	//Subclass level method
	protected abstract void addSauces();
	
}
