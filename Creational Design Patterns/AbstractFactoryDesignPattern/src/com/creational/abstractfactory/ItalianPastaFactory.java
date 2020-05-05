package com.creational.abstractfactory;

public class ItalianPastaFactory {
	public static Pasta makePasta(PastaType type) {
		Pasta pasta= null;
		if(type==PastaType.SPAGHETTI) {
			pasta=new Spaghetti(Style.ITALIAN);
		}
		
		if(type==PastaType.MACARONI) {
			pasta=new Macaroni(Style.ITALIAN);
		}
		
		if(type==PastaType.PENNE) {
			pasta=new Penne(Style.ITALIAN);
		}
		return pasta;
	} 


}
