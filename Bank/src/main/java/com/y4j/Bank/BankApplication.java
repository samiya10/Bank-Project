package com.y4j.Bank;

public class BankApplication {

	public static void main(String[] args) {
		Bank b=new SBI();  
		Bank b1=new PNB();
		System.out.println("ROI for SBI: "+b.rateOfInterest());  
		System.out.println("ROI for PNB: "+b1.rateOfInterest());
	}

}
