package com.structural.composite;

//Component class
public interface Transaction {
	public int getId();
	public String getMessage();
	public void add(Transaction transaction);
	public void delete(Transaction transaction);
	public void print();
	public Transaction getSubType();
	
}
