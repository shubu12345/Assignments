package com.bank;

public class Main {

	public static void main(String[] args) {
		
		HomeLoan hLoan = new HomeLoan("Shubham Shinde",22,6,8);
		PersonalLoan pLoan = new PersonalLoan("Rahul Patil",24,7,10);
		
		System.out.println(hLoan.getHomeLoan());
		System.out.println(pLoan.getPersonalLoan());

	}

}
