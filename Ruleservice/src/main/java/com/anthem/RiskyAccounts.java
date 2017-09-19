package com.anthem;

import java.util.ArrayList;

public class RiskyAccounts {
	private ArrayList<Account> accounts = new ArrayList<Account>();

public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

public void add(Account acc) {
	accounts.add(acc);
}

public void listRiskyAccounts() {
    for (Account acc : accounts)
    System.out.println(acc);
    
    
}

}