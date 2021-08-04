package com.kanchan.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kanchan.spring.assignment.Account;

public class Account_Driver {

	public static void main(String[] args) {
		List<Users> users = new ArrayList<>();
		users.add(new Users(1, "SA", "Kanchan", 2000.0));
		users.add(new Users(2, "SA", "Pari", 2500.0));
		users.add(new Users(3, "SA", "Mahira", 30000.0));
		users.add(new Users(4, "SA", "Kashish", 40000.0));
		users.add(new Users(5, "SA", "Rida", 20000.0));
		users.add(new Users(6, "CA", "Iqra", 10000.0));
		users.add(new Users(7, "CA", "Hamna", 5000.0));
		users.add(new Users(8, "CA", "Aasi", 100000.0));
		users.add(new Users(9, "CA", "Maham", 50000.0));
		users.add(new Users(10, "CA", "Malika", 700000.0));

		System.out.println("What do u want to perform : ");
		System.out.println("1. Credit \n2. Debit \n3. Display");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num == 1) {
			System.out.println("Enter acount_id: ");
			int id = scan.nextInt();
			System.out.println("Enter Account type: SA/CA ");
			String account_type = scan.next();
			System.out.println(account_type);
			if (account_type.contentEquals("SA")) {
				Saving_Account saving = new Saving_Account();
				saving.credit((ArrayList<Users>) users, id, account_type);
			}
			if (account_type.contentEquals("CA")) {
				Current_Account current = new Current_Account();
				current.credit((ArrayList<Users>) users, id, account_type);
			}

		}

		if (num == 2) {
			System.out.println("Enter acount_id: ");
			int id = scan.nextInt();
			System.out.println("Enter Account type: SA/CA ");
			String account_type = scan.next();
			if (account_type.contentEquals("SA")) {
				Saving_Account saving = new Saving_Account();
				saving.debit((ArrayList<Users>) users, id, account_type);
			}
			if (account_type.contentEquals("CA")) {
				Current_Account current = new Current_Account();
				current.debit((ArrayList<Users>) users, id, account_type);
			}

		}
		if (num == 3) {
			System.out.println("Enter acount_id: ");
			int id = scan.nextInt();
			System.out.println("Enter Account type: SA/CA ");
			String account_type = scan.next();
			if (account_type.contentEquals("SA")) {
				Saving_Account saving = new Saving_Account();
				saving.display((ArrayList<Users>) users, id);
			}
			if (account_type.contentEquals("CA")) {
				Current_Account current = new Current_Account();
				current.display((ArrayList<Users>) users, id);
			}

		}
	}
}
