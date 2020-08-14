package com.ta.salesforce;

public class TC_2_LoginSF extends ReusableMethod{

	public static void main(String[] args) throws Exception {
		// Login To SalesForce -2
		launchBrowser("ch");
		login();
		
		System.out.println("Login successful");
	}

}
