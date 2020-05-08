package com.structural.composite;

//Component class
public interface Employee {
	public int getId();
	public String getName();
	public Employee getSubType(int i);
	public void add(Employee employee);
	public void delete(Employee employee);
	public void print();	
}
