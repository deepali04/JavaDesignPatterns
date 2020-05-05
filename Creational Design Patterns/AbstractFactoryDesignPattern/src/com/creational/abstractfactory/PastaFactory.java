package com.creational.abstractfactory;

public class PastaFactory {
	
	public static Pasta makePasta(PastaType type) {
		Pasta pasta =null;
		Style style=Style.DEFAULT	;
		
		if (style==Style.ITALIAN) 
			pasta=ItalianPastaFactory.makePasta(type);		
		else if (style==Style.INDIAN)
			pasta=IndianPastaFactory.makePasta(type);
		else if(style==Style.DEFAULT)
			pasta= DefaultPastaFactory.makePasta(type);
		else
			System.out.println("Not a type of Pasta");
		
		return pasta;
	}
	

}
