package com.behavioural.state;

public class Created implements OrderState {
	
	//Singleton Object
	private static Created createdInstance =new Created();
	
	private Created() {}

	public static Created createdInstance() {
		return createdInstance;
	}

	@Override
	//Business Logic and state transition
	public void updateState(DeliveryContext context) {
		// TODO Auto-generated method stub
		System.out.println("Order is Created!!!");
		context.setCurrentState(Packed.packedInstance()); //setting state to next state
	}
}
