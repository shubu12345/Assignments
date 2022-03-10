package com.bank;

public class PersonalLoan {

	private String PersonName;
	private int age;
	private int months;
	private float interest;
	
	
	public PersonalLoan(String PersonName,int age,int months,float interest)
	{
		this.PersonName=PersonName;
		this.age=age;
		this.months=months;
		this.interest=interest;
	}
	
	public String getPersonalLoan() {
	
		return "PeronName:" +PersonName+ " Age" +age+ " Months:"+months+ " Interest:"+interest;
}
}
