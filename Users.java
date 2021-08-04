package com.kanchan.assignments;

public class Users {

	private int account_id;
	private String account_type;
	private String name;
	private double balance;

	public Users(int account_id, String account_type, String name, double balance) {
		super();
		this.account_id = account_id;
		this.account_type = account_type;
		this.name = name;
		this.balance = balance;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_type=" + account_type + ", name=" + name + ", balance="
				+ balance + "]";
	}

}
