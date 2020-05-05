package com.creational.abstractfactory;

public class Spaghetti extends Pasta{

	Spaghetti(Style style){
		super(PastaType.SPAGHETTI,style);	
		addSauces();
	}

	@Override
	protected void addSauces() {
		// TODO Auto-generated method stub
		System.out.println("Making Spaghetti Pasta");
		//adding Sauces for Spaghetti
	}
	
}
