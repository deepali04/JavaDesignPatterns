package com.structural.adapter;

//Client class
public class TestClass {
	
	public static void main(String[] args) {
		
		Creditcard creditCard =new Customer();
		creditCard.getBankDetails();
		System.out.println(creditCard.getCreditcard());
	}

}
