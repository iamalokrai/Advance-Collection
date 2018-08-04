package com.cg.collection.employee;

//Class EmployeeInformation having all info of employee
public class EmployeeInformation {
	int empID;
	String employeeName;
	String employeeDesignation;
	double employeeSalary;
	int empComm;

	public int getEmpID() { // to get the empId
		return empID;
	}

	public void setEmpID(int empID) { // to set empId with parameter
		this.empID = empID;
	}

	public String getEmployeeName() { // to get emp name without parameter
		return employeeName;
	}

	public void setEmployeeName(String employeeName) { // to set emp Name with
														// parameter
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmpComm() {
		return empComm;
	}

	public void setEmpComm(int empComm) {
		this.empComm = empComm;
	}

	// Overriding toString method to display from calling constructor
	@Override
	public String toString() {
		return "\nEmployeeInformation [empID=" + empID + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary + ", empComm=" + empComm + "]";
	}

}
