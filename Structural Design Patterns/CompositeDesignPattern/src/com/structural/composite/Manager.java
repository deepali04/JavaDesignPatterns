package com.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Composite that implements component
public class Manager implements Employee{
	
	private int id;
	private String name;
	List<Employee> employees = new ArrayList<Employee>();
	
	public Manager(int id, String name) {
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
		return employees.get(i);
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		employees.remove(employee);
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("==========================");  
	    System.out.println("Id ="+getId());  
	    System.out.println("Name ="+getName());
	    System.out.println("=========================="); 
	
	    Iterator<Employee> iterator = employees.iterator();
	    
	    while (iterator.hasNext()) {
			Employee employee = iterator.next();
			employee.print();
			
		}
	}

}
