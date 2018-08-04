package com.cg.collection.employee;

import java.util.HashMap;

//Test class to test the employee class and with main function
public class EmployeeTest {

	public static void main(String[] args) {

		// objects of employee created
		EmployeeInformation empInfo1 = new EmployeeInformation();
		EmployeeInformation empInfo2 = new EmployeeInformation();

		// two objects of saving account created
		MMASavingAccount saccInfo1 = new MMASavingAccount();
		MMASavingAccount saccInfo2 = new MMASavingAccount();

		// setting the data by calling the setter method of employee
		empInfo1.setEmpID(155326);
		empInfo1.setEmployeeName("Alok");
		empInfo1.setEmployeeDesignation("Software Engineer");
		empInfo1.setEmployeeSalary(17032);
		empInfo1.setEmpComm(2500);

		// setting the data by calling the setter method of account class
		saccInfo1.setAccID(12345);
		saccInfo1.setAccountHolderName("Alok");
		saccInfo1.setAccountbalance(103268);
		saccInfo1.setSalaryAccount(true);

		// setting the data of 2nd emp
		empInfo2.setEmpID(155427);
		empInfo2.setEmployeeName("Rahul");
		empInfo2.setEmployeeDesignation("Analyst");
		empInfo2.setEmployeeSalary(17032);
		empInfo2.setEmpComm(2500);

		// Setting the data of saving account of the 2nd employee
		saccInfo2.setAccID(13265);
		saccInfo2.setAccountHolderName("Rahul");
		saccInfo2.setAccountbalance(10235);
		saccInfo2.setSalaryAccount(true);

		// Hash map created with empinfo as key
		HashMap<EmployeeInformation, MMASavingAccount> match = new HashMap<>();
		match.put(empInfo1, saccInfo1);
		match.put(empInfo2, saccInfo2);

		System.out.println(match);

	}

}
