package com.codingNinjas.Bank.Account.Registration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**
  This class is an implementation of a "Account" Interface based on the selection 
  done in the console for account type. You need to complete this class
  based on the following tasks.


   a. Create attribute amount(double) 
   b. Override the methods of Account Interface.
   c. Build the logic for all the methods based on the description mentioned in the Account Interface.

**/

@Component("savingsAccount")
@Scope("prototype")
public class savingsAccount implements Account{
	
	private double amount;
	private final String accountType = "SAVINGS ACCOUNT";
	public savingsAccount() {
		this.amount = 0;
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Saving Account created");
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return this.accountType;
	}

	@Override
	public void addBalance(double balance) {
		// TODO Auto-generated method stub
		this.amount+=balance;
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.amount;
	}

}
