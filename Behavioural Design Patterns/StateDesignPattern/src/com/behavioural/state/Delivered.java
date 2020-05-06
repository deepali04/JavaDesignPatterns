package com.behavioural.state;

public class Delivered implements OrderState {
	
	//Singleton Object
	private static Delivered deliveredInstance= new Delivered();
	
	private Delivered() {}

	public static Delivered deliveredInstance() {
		return deliveredInstance;
	}
	
	@Override
	//Business Logic and state transition
	public void updateState(DeliveryContext context) {
		// TODO Auto-generated method stub
		System.out.println("Order is Delivered!!!");
		
	}
	

}
