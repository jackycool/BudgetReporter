/**
 * Package contains all user models
 */
package com.budgetreporter.Model;

import java.util.Date;

/**
 * Income class
 * 
 * @author Jacky
 *
 */
public class Income {

	private int income_id;
	private int user_id;
	private String name;
	private boolean recurring;
	private Date income_date;
	private float balance;
	
	/**
	 * Income class constructor
	 */
	public Income(){
		
	}

	/* Getter function for income name */
	public String getName() {
		return name;
	}

	/* Setter function for income name */
	public void setName(String name) {
		this.name = name;
	}

	/* Getter function for income_id */
	public int getIncome_id() {
		return income_id;
	}

	/* Setter function for income_id */
	public void setIncome_id(int income_id) {
		this.income_id = income_id;
	}

	/* Getter function for user_id */
	public int getUser_id() {
		return user_id;
	}

	/* Setter function for user_id */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/* Getter function for recurring */
	public boolean isRecurring() {
		return recurring;
	}

	/* Setter function for recurring */
	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}

	/* Getter function for income_date */
	public Date getIncome_date() {
		return income_date;
	}

	/* Setter function for income_date */
	public void setIncome_date(Date income_date) {
		this.income_date = income_date;
	}

	/* Getter function for balance */
	public float getBalance() {
		return balance;
	}

	/* Setter function for balance */
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
