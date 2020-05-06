package com.behavioural.state;

public class OutForDelivery implements OrderState {
	
	//Singleton Object
	private static OutForDelivery outForDeliveryInstance = new  OutForDelivery();
	
	private OutForDelivery() {}
	
	public static OutForDelivery outForDeliveryInstance() {
		return outForDeliveryInstance;
	}

	@Override
	//Business Logic and state transition
	public void updateState(DeliveryContext context) {
		// TODO Auto-generated method stub
		System.out.println("Order is Out for Delivery!!!");
		context.setCurrentState(Delivered.deliveredInstance());//setting state to next state
		
		
	}

}
