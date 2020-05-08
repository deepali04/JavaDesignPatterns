package com.structural.composite;

public class TestClass {
	
	public static void main(String[] args) {
		Employee e1= new Developer(101, "Deepali");
		Employee e2= new Developer(102, "Misha");
		
		Employee e3=new Tester(901, "Riya");
		
		Employee manager1=new Manager(1001, "XYZ");
		
		manager1.add(e1);
		manager1.add(e2);
		manager1.add(e3);
		manager1.print();
	}

}
