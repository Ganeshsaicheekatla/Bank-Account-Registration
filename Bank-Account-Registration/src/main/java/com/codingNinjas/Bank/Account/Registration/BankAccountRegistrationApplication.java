package com.codingNinjas.Bank.Account.Registration;

import java.util.List;
import java.util.Scanner;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BankAccountRegistrationApplication {

	public static void main(String[] args) {

		/*
		
		* 1. Fetch context from ApplicationContext.xml and initiate scanner.
		* 2. Get user details from console.
		* 3. Get account details from user and add them to the account list.
		* 4. Display the list of accounts with their reference ids.
		*/
		
		Scanner sc = new Scanner(System.in);
		

		ConfigurableApplicationContext context = SpringApplication.run(BankAccountRegistrationApplication.class, args);
		
		System.out.println("\n\nWeclome to BANK ACCOUNT REGISTRATION Application:");
		
		User userObj = (User)context.getBean("myUser");
		
//		Taking input for userName
		System.out.println("Enter your Name:");
		String userName = sc.nextLine();
		int accountCreateChoice = 1;
		int accountTypeChoice;
		
		while(accountCreateChoice != 2)
		{
			System.out.println("You Wnat to open new Acount?\n1.Yes \n2.No");
			accountCreateChoice = sc.nextInt();
			if(accountCreateChoice  == 1)
			{
				System.out.println("Choice your Account Type?\n1.Saving Account \n2.Current Account");
				accountTypeChoice = sc.nextInt();
				
				switch(accountTypeChoice) {
						case 1 ->{
							Account savingsAccount = (Account)context.getBean("savingsAccount");
								System.out.println("Enter the opening balance:");
								double amount = sc.nextDouble();
								savingsAccount.addBalance(amount);
							userObj.addAccount(savingsAccount);
						}
						case 2 ->{
							Account currentAccount = (Account)context.getBean("currentAccount");
								System.out.println("Enter the opening balance:");
								double amount = sc.nextDouble();
								currentAccount.addBalance(amount);
						    userObj.addAccount(currentAccount);
						}
						default -> {
							  System.out.println("Entered Invalid option Exiting for Application....");
							  return ;
					    	}
				 }
			
			 }
			
		  }
		
		
		System.out.println("\n\nHi "+userName+", here is the list of your account");
		
		List<Account> userAccountsList = userObj.getAllAccounts();
		
		
		for(Account account:userAccountsList) {
			int strLen = account.toString().length();
			System.out.println(account.getAccountType()+" : "+"opening balance - "+account.getBalance()+
					" Reference Id "+ account.toString().substring(strLen-8));
		}
		
		

	}

}
