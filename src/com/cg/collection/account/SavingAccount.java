package com.cg.collection.account;

//cLASS Saving Account 
public class SavingAccount implements Comparable<SavingAccount> {
	double accBalance;
	int accID;
	String accHolderName;
	boolean isSalaryAccount;

	// Constructor for this class
	public SavingAccount(double accBalance, int accID, String accHolderName, boolean isSalaryAccount) {
		super();
		this.accBalance = accBalance;
		this.accID = accID;
		this.accHolderName = accHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public void withdraw() { // Withdraw method

	}

	public void deposit() { // Deposite method

	}

	public double getAccBalance() { // Getter method
		return accBalance;
	}

	public void setAccBalance(double accBalance) { // Setter method
		this.accBalance = accBalance;
	}

	public int getAccID() { // to get the account Id
		return accID;
	}

	public void setAccID(int accID) { // to set accountId
		this.accID = accID;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public String toString() {
		return "SavingAccount [accBalance=" + accBalance + ", accID=" + accID + ", accHolderName=" + accHolderName
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	@Override
	public int compareTo(SavingAccount arg0) {
		// TODO Auto-generated method stub
		return this.accID - arg0.accID;
	}

}
