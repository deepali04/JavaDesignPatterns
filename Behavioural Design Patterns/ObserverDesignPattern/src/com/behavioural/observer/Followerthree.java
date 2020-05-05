package com.behavioural.observer;

public class Followerthree implements Observer{

	@Override
	public void update(Status s) {
		// TODO Auto-generated method stub
		System.out.println("Follwer Three :: " + s.getStatusContent());
	}

}
