package com.behavioural.state;

public class TestClass {
	
	public static void main(String[] args) {
		
		DeliveryContext context = new DeliveryContext(null, "FL1010101");
		context.update();
		context.update();
		context.update();
		context.update();
		context.update();
	}

}
