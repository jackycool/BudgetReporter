/**
 * Package contains all user models
 */
package com.budgetreporter.Model;

import java.util.Date;

/**
 * Expense class
 * 
 * @author Jacky
 *
 */
public class Expense {
	
	private int expense_id;
	private int user_id;
	private String name;
	private boolean recurring;
	private Date expense_date;
	private String category;
	private float balance;

	/**
	 * Expense class constructor
	 */
	public Expense(){
	}

	/* Getter function for expense_id */
	public int getExpense_id() {
		return expense_id;
	}

	/* Setter function for expense_id */
	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}

	/* Getter function for user_id */
	public int getUser_id() {
		return user_id;
	}

	/* Setter function for user_id */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/* Getter function for name of the expense */
	public String getName() {
		return name;
	}

	/* Setter function for name of the expense */
	public void setName(String name) {
		this.name = name;
	}

	/* Getter function for recurring */
	public boolean isRecurring() {
		return recurring;
	}

	/* Setter function for recurring */
	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}

	/* Getter function for expense_date */
	public Date getExpense_date() {
		return expense_date;
	}

	/* Setter function for expense_date */
	public void setExpense_date(Date expense_date) {
		this.expense_date = expense_date;
	}

	/* Getter function for category of the expense */
	public String getCategory() {
		return category;
	}

	/* Setter function for category of the expense */
	public void setCategory(String category) {
		this.category = category;
	}

	/* Getter function for balance of the expense */
	public float getBalance() {
		return balance;
	}

	/* Setter function for balance of the expense */
	public void setBalance(float balance) {
		this.balance = balance;
	}

}
