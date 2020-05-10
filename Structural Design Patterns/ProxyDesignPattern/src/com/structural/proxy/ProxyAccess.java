package com.structural.proxy;

//Implements officeInternet to provide the access to completeInternet
public class ProxyAccess implements OfficeInternet {
	
	private String employeeName;
	int level;
	private CompleteAccess completeAccess;
	
	public ProxyAccess(String emplyoeeName,int level) {
		// TODO Auto-generated constructor stub
		this.employeeName= emplyoeeName;
		this.level=level;
	}

	@Override
	public void grantAccess() {
		// TODO Auto-generated method stub
		if(level>=5) {
			completeAccess= new CompleteAccess(employeeName,level);
			completeAccess.grantAccess();
		}
		else
			System.out.println("Can't provide access, your job level is below 5");
	}

}
