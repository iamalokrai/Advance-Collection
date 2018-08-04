package com.cg.collection.account;

import java.util.TreeSet;

//Class BankAccountList to create a collectio of Accounts
public class BankAccountList {

	public static void main(String[] args) {
		// Tree set to display all the account details in ascending order if
		// accID
		//Collection created
		TreeSet<SavingAccount> savingaccount = new TreeSet<SavingAccount>();
		savingaccount.add(new SavingAccount(10439.00, 102495, "Alok", true));
		savingaccount.add(new SavingAccount(10439.00, 102436, "Mayur", true));
		savingaccount.add(new SavingAccount(10439.00, 102485, "Udit", true));
		savingaccount.add(new SavingAccount(10439.00, 102487, "Gaurav", true));
		savingaccount.add(new SavingAccount(10439.00, 102301, "Rahul", true));
		savingaccount.add(new SavingAccount(10439.00, 102466, "Dhawan", true));
		for (SavingAccount sav : savingaccount) {
			System.out.println(sav);
		}

	}

}
