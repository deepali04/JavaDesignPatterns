package com.creational.factory;

public class Penne extends Pasta {
	
	Penne(){
		super(PastaType.PENNE);
		addSauces();
	}

	@Override
	protected void addSauces() {
		// TODO Auto-generated method stub
		System.out.println("Making Penne Pasta");
		//adding Sauces for Penne
	}

}
