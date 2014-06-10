/**
 * Package inclue all budgetreporter coding
 */
package com.budgetreporter;

import com.budgetreporter.DB.DBOperations;

/**
 * Entry for the application
 * 
 * @author jacky
 *
 */
public class BudgetReporter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		run();
	}
	
	public static void run(){
		DBOperations op = new DBOperations();
		//op.connectToAndQueryDatabaseTest();
		//op.createTableUsers();
		//op.CreateTableIncome();
		//op.CreateTableExpense();
	}

}
