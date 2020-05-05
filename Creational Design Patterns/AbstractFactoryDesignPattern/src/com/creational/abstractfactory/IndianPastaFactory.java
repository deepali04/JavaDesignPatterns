package com.creational.abstractfactory;

public class IndianPastaFactory {
	public static Pasta makePasta(PastaType type) {
		Pasta pasta= null;
		if(type==PastaType.SPAGHETTI) {
			pasta=new Spaghetti(Style.INDIAN);
		}
		
		if(type==PastaType.MACARONI) {
			pasta=new Macaroni(Style.INDIAN);
		}
		
		if(type==PastaType.PENNE) {
			pasta=new Penne(Style.INDIAN);
		}
		return pasta;
	} 

}
