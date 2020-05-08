package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite that implements component
public class Deposit implements Transaction{
	
	private int id;
	private String message;
	List<Transaction> transaction = new ArrayList<Transaction>();
	
	public Deposit(int id, String message) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.message=message;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void add(Transaction transaction) {
		// TODO Auto-generated method stub
		transaction.add(transaction);
	}

	@Override
	public void delete(Transaction transaction) {
		// TODO Auto-generated method stub
		transaction.delete(transaction);
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction getSubType() {
		// TODO Auto-generated method stub
		return null;
	}

}
