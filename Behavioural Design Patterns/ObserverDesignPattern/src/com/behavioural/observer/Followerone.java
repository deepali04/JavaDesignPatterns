package com.behavioural.observer;

public class Followerone implements Observer {

	@Override
	public void update(Status s) {
		// TODO Auto-generated method stub
		System.out.println("Follwer One :: " + s.getStatusContent());
	}

}
