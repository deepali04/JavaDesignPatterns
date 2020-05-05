package com.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Uniqueuser implements User {
		private List<Observer> observers = new ArrayList<>();

		@Override
		public void add(Observer o) {
			// TODO Auto-generated method stub
			observers.add(o);
				
		}

		@Override
		public void delete(Observer o) {
			// TODO Auto-generated method stub
			observers.remove(o);
			
		}

		@Override
		public void notifyUpdate(Status s) {
			// TODO Auto-generated method stub
			for (Observer o : observers) {
				o.update(s);
			}
			
		}
		
		
}