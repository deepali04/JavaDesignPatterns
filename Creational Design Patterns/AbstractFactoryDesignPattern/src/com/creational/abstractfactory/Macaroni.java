package com.creational.abstractfactory;

public class Macaroni extends Pasta{
	public Macaroni(Style style) {
		// TODO Auto-generated constructor stub
		super(PastaType.MACARONI,style);
		addSauces();
	}

	@Override
	protected void addSauces() {
		// TODO Auto-generated method stub
		System.out.println("Making Macaroni Pasta in" +super.getStyle()+" style");
		//adding style for Macaroni Pasta 
	}

}
