package com.structural.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer extends BankDetails implements Creditcard {

	@Override
	public void getBankDetails() {
		// TODO Auto-generated method stub
		try {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the customer's Name :");
		String customerName = br.readLine();
		System.out.println("\n");
		
		System.out.println("Enter the Account Number :");
		long accountNumber = Long.parseLong(br.readLine());
		System.out.println("\n");
		
		System.out.println("Enter the bank name :");
		String bankName= br.readLine();
		
		setAccountNumber(accountNumber);
		setCustomerName(customerName);
		setBankName(bankName);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public String getCreditcard() {
		// TODO Auto-generated method stub
		long accountNumber = getAccountNumber();
		String customerName = getCustomerName();
		String bankName= getBankName();
		
		return ("Credit Card will be issued to "+customerName+" having account number " + accountNumber + " in "+bankName+" bank");
		
	}

}
