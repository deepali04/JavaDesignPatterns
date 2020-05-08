package com.structural.composite;

public class Tester implements Employee {
	
	private int id;  
    private String name;
    
    public Tester(int id, String name) {
		// TODO Auto-generated constructor stub
    	this.id=id;
    	this.name=name;
    	
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Employee getSubType(int i) {
		// TODO Auto-generated method stub
		//this is leaf node so this method is not applicable to this class.
		return null;
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		//this is leaf node so this method is not applicable to this class. 
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		 //this is leaf node so this method is not applicable to this class. 
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("==========================");  
        System.out.println("Id ="+getId());  
        System.out.println("Name ="+getName());  
        System.out.println("==========================");  
		
	}

}
