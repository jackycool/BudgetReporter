/**
 * Package inclue all budgetreporter coding
 */
package com.budgetreporter;

import com.budgetreporter.DB.DBOperations;
import com.budgetreporter.View.LoginView;

/**
 * Entry for the application
 * 
 * @author jacky
 *
 */
public class BudgetReporter {
	
	public BudgetReporter(){
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	LoginView lv = new LoginView();
            	lv.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		start();
	}
	
	public static void start(){
		BudgetReporter br = new BudgetReporter();
		//DBOperations op = new DBOperations();
		//op.connectToAndQueryDatabaseTest();
		//op.createTableUsers();
		//op.CreateTableIncome();
		//op.CreateTableExpense();
	}

}
