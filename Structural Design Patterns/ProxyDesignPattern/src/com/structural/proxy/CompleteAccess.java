package com.structural.proxy;

public class CompleteAccess implements OfficeInternet{

	private String employeeName;
	private int level;
	
	public CompleteAccess(String employeeName, int level) {
		// TODO Auto-generated constructor stub
		this.employeeName=employeeName;
		this.level=level;
	}
	@Override
	public void grantAccess() {
		// TODO Auto-generated method stub
		System.out.println("Complete access granted for employee "+ employeeName +" with level "+level);
		
	}

}
