package com.bank;

public class HomeLoan {

	private String personName;
	private int age;
	private int months;
	private float interest;
	
	
	public HomeLoan(String personName, int age, int months,float interest) {
		
		this.personName=personName;
		this.age=age;
		this.months=months;
		this.interest=interest;
	}
	
	
	public String getHomeLoan()
	{
		return "PeronName:" +personName+" Age" +age+ " Months:"+months+ " Interest:"+interest;
	}
}
