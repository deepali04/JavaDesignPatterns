package com.creational.factory;

public class PastaFactory {
	
	public static Pasta makePasta(PastaType type) {
		Pasta pasta =null;
		
		if (type==PastaType.SPAGHETTI) 
			pasta=new Spaghetti();		
		else if (type==PastaType.PENNE)
			pasta=new Penne();
		else if(type==PastaType.MACARONI)
			pasta= new Macaroni();
		else
			System.out.println("Not a type of Pasta");
		
		return pasta;
	}
	

}
