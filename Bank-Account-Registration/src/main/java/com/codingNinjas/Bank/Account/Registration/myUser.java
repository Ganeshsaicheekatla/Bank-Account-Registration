package com.codingNinjas.Bank.Account.Registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
  This class is an implementation of a User Interface based on the selection 
  done in the console for user information.You need to complete this class 
  based on the following tasks.

   a. Adding common attributes: 
       1. String name
       2. List<Account> accountList.
   b. Override the methods of User Interface.
**/

@Component("myUser")
@Scope("singleton")
public class myUser implements User{
	
	private String name;
	private List<Account> userAccountsList;
	
	public myUser() {
		userAccountsList = new ArrayList<>();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("User Object created");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.print("User object destroyed");
	}
	@Override
	public void setUserDetails(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		this.userAccountsList.add(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return this.userAccountsList;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
