package com.creational.abstractfactory;

public class Penne extends Pasta {
	
	Penne(Style style){
		super(PastaType.PENNE,style);
		addSauces();
	}

	@Override
	protected void addSauces() {
		// TODO Auto-generated method stub
		System.out.println("Making Penne Pasta in "+super.getStyle()+" style");
		//adding Sauces for Penne
	}

}
