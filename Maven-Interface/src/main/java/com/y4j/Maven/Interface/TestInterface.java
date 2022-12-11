package com.y4j.Maven.Interface;

class TestInterface{  
public static void main(String[] args){  
Bank b=new SBI();  
Bank b1=new PNB();
System.out.println("ROI for SBI: "+b.rateOfInterest());  
System.out.println("ROI for PNB: "+b1.rateOfInterest());
}
}