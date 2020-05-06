package com.behavioural.mediator;

public class User2 extends Users {
	
	private String name;
	private Conversation conversation;
	
	public User2(Conversation conversation) {
		// TODO Auto-generated constructor stub
		this.conversation=conversation;
	}
	

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		conversation.viewMessage(message, this);
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


}
