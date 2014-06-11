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
	
	public BudgetReporter(){}

	public static void main(String[] args) {
		System.out.println("Hi");
		run();
	}
	
	public static void run(){
		BudgetReporter br = new BudgetReporter();
		//DBOperations op = new DBOperations();
		//op.connectToAndQueryDatabaseTest();
		//op.createTableUsers();
		//op.CreateTableIncome();
		//op.CreateTableExpense();
	}

}
