package com.behavioural.mediator;

public class TestClass {
	
	public static void main(String[] args) {
		
		Conversation conversation = new ConversationRoom();
		
		
		User1 u1= new User1(conversation);
		u1.setName("Joey Tribbiani");
		u1.sendMessage("How you doin'?");
		
		
		User2 u2= new User2(conversation);
		u2.setName("Barney Stinson");
		u2.sendMessage("Challange Accepted!!!");
		
		
		
	}

}
