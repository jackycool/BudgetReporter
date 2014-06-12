/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * This view contains Expense/Income detail for specific expense/income 
 * that user has selected.

 * @author jacky
 *
 */
public class EntryDetailView extends JPanel{
	
	private String entryType;
	
	public EntryDetailView(String entryType){
		super();
		this.entryType = entryType;
		initUI();
	}
	
	public void initUI(){
		GridLayout gLayout = new GridLayout(0,1);
		this.setLayout(gLayout);
        
		//Add a label to indicate whether this is an income or expense
		JLabel titleLabel = new JLabel(this.entryType);
		
        //Add the "Back/Cancel" button
        JButton backButton = new JButton("Back");
        //Add the "Submit" button
        JButton submitButton = new JButton("Submit");

		//Create an inner panel to hold detail of the report
		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(new GridLayout(0,2));
		
        //Add the "Name" label and textfield
        JLabel nameLabel = new JLabel("Name");
        JTextField nameTextField = new JTextField();

        //Add the "Balance" label and textfield
        JLabel balanceLabel = new JLabel("Balance");
        JTextField balanceTextField = new JTextField();
        
        //Add the "Date" label and textfield
        JLabel dateLabel = new JLabel("Date");
        JTextField dateTextField = new JTextField();
        
        //Add the "Recurring" label and radio button
        JLabel recurringLabel = new JLabel("Recurring Monthly?");
        JRadioButton recurringRadioButton = new JRadioButton("Yes");

        //Add the "Category" button and textfield
        JLabel categoryLabel = new JLabel("Category");
        JTextField categoryTextField = new JTextField();

        //Inner panel component added
        innerPanel.add(nameLabel);
        innerPanel.add(nameTextField);
        innerPanel.add(balanceLabel);
        innerPanel.add(balanceTextField);
        innerPanel.add(dateLabel);
        innerPanel.add(dateTextField);
        innerPanel.add(recurringLabel);
        innerPanel.add(recurringRadioButton);
        innerPanel.add(categoryLabel);
        innerPanel.add(categoryTextField);

        this.add(titleLabel);
        this.add(innerPanel);
        this.add(submitButton);
        this.add(backButton);
        
        System.out.println("Entry Detail page created");		
	}
}
