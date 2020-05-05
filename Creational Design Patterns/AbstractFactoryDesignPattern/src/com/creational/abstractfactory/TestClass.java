package com.creational.abstractfactory;

public class TestClass {
	public static void main(String[] args) {
		PastaFactory.makePasta(PastaType.SPAGHETTI);
		//PastaFactory.makePasta(PastaType.MACARONI);
		//PastaFactory.makePasta(PastaType.PENNE);
	}

}

