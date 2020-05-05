package com.creational.abstractfactory;

public class DefaultPastaFactory {
	public static Pasta makePasta(PastaType type) {
		Pasta pasta= null;
		if(type==PastaType.SPAGHETTI) {
			pasta=new Spaghetti(Style.DEFAULT);
		}
		
		if(type==PastaType.MACARONI) {
			pasta=new Macaroni(Style.DEFAULT);
		}
		
		if(type==PastaType.PENNE) {
			pasta=new Penne(Style.DEFAULT);
		}
		return pasta;
	} 
}
