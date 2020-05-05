package com.behavioural.observer;

public class Followertwo implements Observer {

	@Override
	public void update(Status s) {
		// TODO Auto-generated method stub
		System.out.println("Follwer Two :: " + s.getStatusContent());
	}

}
