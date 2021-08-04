package com.kanchan.assignments;

import java.util.ArrayList;

public interface IAccount {

	public Users debit(ArrayList<Users> users, int amount, String account_type);

	public Users credit(ArrayList<Users> users, int amount, String account_type);

	public void display(ArrayList<Users> users, int id);

}
