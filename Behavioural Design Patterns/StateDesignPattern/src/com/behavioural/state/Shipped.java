package com.behavioural.state;

public class Shipped implements OrderState {
	
	//Singleton Object
	private static Shipped shippedInstance = new Shipped();
	
	private Shipped() {}
	
	public static Shipped shippedInstance() {
		return shippedInstance;
	}

	@Override
	//Business Logic and state transition
	public void updateState(DeliveryContext context) {
		// TODO Auto-generated method stub
		System.out.println("Order is Shipped!!!");
		context.setCurrentState(OutForDelivery.outForDeliveryInstance()); //setting state to next state
		
	}
	
}
