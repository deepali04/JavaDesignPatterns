package com;

public class Application {
	
	public static void main(String[] args) {
		
		
		//Eagerly initialized singleton
		PresidentEager president1 = PresidentEager.getInstance();
		PresidentEager president2 = PresidentEager.getInstance();
		
		System.out.println(president1);
		System.out.println(president2);
		
		
		//Lazy initialized singleton
		PresidentLazyInitialization president3 = PresidentLazyInitialization.getINSTANCE();
		PresidentLazyInitialization president4 = PresidentLazyInitialization.getINSTANCE();
		
		System.out.println(president3);
		System.out.println(president4);
		
		//Lazy initialized singleton
		PresidentThreadSafeSimple president5 = PresidentThreadSafeSimple.getInstance();
		PresidentThreadSafeSimple president6 = PresidentThreadSafeSimple.getInstance();
				
		System.out.println(president5);
		System.out.println(president6);
		
		//Lazy initialized singleton
		PresidentThreadSafeDoubleCheckLocking president7 = PresidentThreadSafeDoubleCheckLocking.getInstance();
		PresidentThreadSafeDoubleCheckLocking president8 = PresidentThreadSafeDoubleCheckLocking.getInstance();
						
		System.out.println(president7);
		System.out.println(president8);
		
	}

}
