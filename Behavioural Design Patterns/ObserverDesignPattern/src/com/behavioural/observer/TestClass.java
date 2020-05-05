package com.behavioural.observer;

public class TestClass {
	
	public static void main(String[] args) {
		
		Followerone f1= new Followerone();
		Followertwo f2= new Followertwo();
		Followerthree f3 = new Followerthree();
		
		Uniqueuser u1 = new Uniqueuser();
		
		u1.add(f1);
		u1.add(f2);
		
		u1.notifyUpdate(new Status("This is the first update"));
		
		u1.delete(f1);
		u1.delete(f3);
		
		u1.notifyUpdate(new Status("This is the second update"));
		
	}
	


}
