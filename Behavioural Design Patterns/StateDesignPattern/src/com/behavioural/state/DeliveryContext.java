package com.behavioural.state;

public class DeliveryContext {
	
	private OrderState currentState;
	private String orderId;
	
	//Setting current state of an order
	public DeliveryContext(OrderState currentState,String orderId) {
		super();
		this.currentState=currentState;
		this.orderId=orderId;
		
		//if null then order will be created first
		if(currentState==null) {
			this.currentState=Created.createdInstance();
		}
	}

	public OrderState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(OrderState currentState) {
		this.currentState = currentState;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	//updating the state to next state
	public void update() {
		currentState.updateState(this);
	}
	
	
}
