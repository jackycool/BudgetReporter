/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author jacky
 *
 */
public class MenuView extends JPanel{
	
	public MenuView(){
		super();
		initUI();
	}
	
	public void initUI(){
		GridLayout gLayout = new GridLayout(0,1);
		this.setLayout(gLayout);
        
        //Add the "View Report" button
        JButton viewReportButton = new JButton("View Report");

        //Add the "New Expense" button
        JButton newExpenseButton = new JButton("New Expense");
        
        //Add the "New Income" button
        JButton newIncomeButton = new JButton("New Income");
        
        //Add the "Profile" button
        JButton profileButton = new JButton("Profile");

        //Add the "Quit" button
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(new QuitButtonListener());

        this.add(profileButton);
        this.add(viewReportButton);
        this.add(newExpenseButton);
        this.add(newIncomeButton);
        this.add(quitButton);
        
        System.out.println("Menu page created");		
	}

	private class QuitButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		    System.exit(0);
		}
	}

}

