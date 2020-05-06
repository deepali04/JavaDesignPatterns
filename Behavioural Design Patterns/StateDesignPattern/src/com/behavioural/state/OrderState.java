package com.behavioural.state;


//interface for Order states
public interface OrderState {

	//will be implemented by different order states
	public void updateState(DeliveryContext context);
}
