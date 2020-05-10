package com.structural.proxy;

public class TestClass {
	
	public static void main(String[] args) {
		OfficeInternet access= new ProxyAccess("Deepali Nagwade",5);
		access.grantAccess();
	}

}
