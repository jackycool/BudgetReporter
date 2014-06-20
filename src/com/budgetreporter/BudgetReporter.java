/**
 * Package inclue all budgetreporter coding
 */
package com.budgetreporter;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.budgetreporter.Controller.*;
import com.budgetreporter.DB.DBOperations;
import com.budgetreporter.View.*;

/**
 * Entry for the application
 * 
 * @author jacky
 *
 */
public class BudgetReporter{
	
	public BudgetReporter(){
	}

	public static void createAndShowGUI(){
		JFrame mainFrame = new JFrame();
    	// Setup Frame
		mainFrame.setSize(300, 500);
		mainFrame.setLocation(10, 200);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a contentPane to use cardlayout
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new CardLayout());
		
        // Create all views
    	LoginView loginPage = new LoginView(contentPane);
    	MenuView menuPage = new MenuView(contentPane);
    	ReportMenuView reportMenuPage = new ReportMenuView(contentPane);
    	LoginViewController loginControl = new LoginViewController(loginPage);
    	MenuViewController menuControl = new MenuViewController(menuPage);
    	ReportMenuViewController reportMenuControl = 
    			new ReportMenuViewController(reportMenuPage);
    	
    	// Add views to contentPane
    	contentPane.add(loginPage, "LoginView");
    	contentPane.add(menuPage, "MenuView");
    	contentPane.add(reportMenuPage, "ReportMenuView");
    	
    	// Set the contentPane to frame
    	mainFrame.setContentPane(contentPane);
    	
    	mainFrame.setVisible(true);
	}

	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	createAndShowGUI();
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
