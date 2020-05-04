package com.creational.factory;

public class Macaroni extends Pasta{
	public Macaroni() {
		// TODO Auto-generated constructor stub
		super(PastaType.MACARONI);
		addSauces();
	}

	@Override
	protected void addSauces() {
		// TODO Auto-generated method stub
		System.out.println("Making Macaroni Pasta");
		//adding Sauces for Macaroni
	}

}
