package com.behavioural.mediator;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ConversationRoom implements Conversation{
	
	DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");  
    Date date = new Date(); 

	@Override
	public void viewMessage(String message, Users user) {
		// TODO Auto-generated method stub
		System.out.print(user.getName()+" sent message: " + message);
		System.out.println("\t"+"["+dateFormat.format(date).toString()+"]");
		
	}

}
