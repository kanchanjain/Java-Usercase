package com.kanchan.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kanchan.spring.assignment.Account;

public class Saving_Account implements IAccount {

	
	 List<Users> users = new ArrayList<>();
		


	Scanner scan = new Scanner(System.in);
	@Override
	public Users debit(ArrayList<Users> userList,int id,String account_type) {
//		
		 this.users=userList;
		 for(Users user:users) {
				if (user.getAccount_id()==id) {
					System.out.println("Enter amt :");
					double amt=scan.nextDouble();
					if(user.getBalance()<=amt) {
						System.out.println("You have insufficient balance:(");
					}
					else {
						System.out.println("amout diducted fron your account :"+amt);
						user.setBalance(user.getBalance()-amt);
						System.out.println("Remaining amount: "+user.getBalance());
						return user;
					}
			
		}
				}
		return null;
	}

	@Override
	public Users credit(ArrayList<Users> userList,int id,String account_type) {
		
		 this.users=userList;
		for (Users user : users) {
			if (user.getAccount_id() == id) {
				
			
				System.out.println("Enter amt :");
				double amt = scan.nextDouble();
				double final_amt = user.getBalance() + amt;
				user.setBalance(final_amt);
				System.out.println(user);
				return user;
	}
		}
		return null;
	}


	@Override
	public void display(ArrayList<Users> userList,int id) {
		
		 this.users=userList;
		for(Users user:users) {
			if (user.getAccount_id()==id) {
		System.out.println("your details is: "+user);
	}

	}
	}
}


