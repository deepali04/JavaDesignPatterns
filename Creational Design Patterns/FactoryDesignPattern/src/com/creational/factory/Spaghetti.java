package com.creational.factory;

public class Spaghetti extends Pasta{

	Spaghetti(){
		super(PastaType.SPAGHETTI);	
		addSauces();
	}

	@Override
	protected void addSauces() {
		// TODO Auto-generated method stub
		System.out.println("Making Spaghetti Pasta");
		//adding Sauces for Spaghetti
	}
	
}
