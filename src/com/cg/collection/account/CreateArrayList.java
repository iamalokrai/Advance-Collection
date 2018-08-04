package com.cg.collection.account;

import java.util.*;

//Class to create the array list of the savingAccounts
public class CreateArrayList {

	public static void main(String[] args) {
		// Array list created for Saving aCCOUNT
		ArrayList<SavingAccount> savingaccount = new ArrayList<SavingAccount>();
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
