package com.behavioural.state;

public class Packed implements OrderState {
	
	//Singleton Object
	private static Packed packedInstance=new Packed();
	
	private Packed() {}
	
	public static Packed packedInstance() {
		return packedInstance;
	}

	@Override
	//Business Logic and state transition
	public void updateState(DeliveryContext context) {
		// TODO Auto-generated method stub
		System.out.println("Order is Packed!!!");
		context.setCurrentState(Shipped.shippedInstance());//setting state to next state
	}

}
