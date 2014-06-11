/**
 * Package inclue all budgetreporter coding
 */
package com.budgetreporter;

import javax.swing.JFrame;

import com.budgetreporter.DB.DBOperations;
import com.budgetreporter.View.LoginView;

/**
 * Entry for the application
 * 
 * @author jacky
 *
 */
public class BudgetReporter extends JFrame{
	
	public BudgetReporter(){
		super("BudgetReporter");
        this.setSize(300, 200);
        this.setLocation(10, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	BudgetReporter br = new BudgetReporter();
            	LoginView loginPage = new LoginView();
            	br.add(loginPage);
            	br.setVisible(true);
            }
        });
	}
	
	public static void testDB(){
		DBOperations op = new DBOperations();
		op.connectToAndQueryDatabaseTest();
		op.createTableUsers();
		op.CreateTableIncome();
		op.CreateTableExpense();
	}

}
