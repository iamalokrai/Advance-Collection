package com.cg.collection.employee;

//Saving account class for the details of the savings account of the employees
public class MMASavingAccount {
	int accID;
	String accountHolderName;
	double accountbalance;
	boolean isSalaryAccount;

	public int getAccID() { // getter method without parameter
		return accID;
	}

	public void setAccID(int accID) { // setter method with parameter
		this.accID = accID;
	}

	// getter method for getting account holder name
	public String getAccountHolderName() {
		return accountHolderName;
	}

	// setter method for the account holder names
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	// Overriding toString
	@Override
	public String toString() {
		return "\nMMASavingAccount [accID=" + accID + ", accountHolderName=" + accountHolderName + ", accountbalance="
				+ accountbalance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

}
