package com.behavioural.observer;

public interface User {

	public void add(Observer o);
	public void delete(Observer o);
	public void notifyUpdate(Status s);
}
