/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
public class EntryDetailView extends JFrame{
	
	private String entryType;
	private JButton m_cancelButton;
	private JButton m_submitButton;
	private JTextField m_nameTextField;
	private JTextField m_balanceTextField;
	private JTextField m_dateTextField;
	private JRadioButton m_recurringRadioButton;
	private JTextField m_categoryTextField;
	
	public EntryDetailView(String entryType){
		super(entryType);
		this.entryType = entryType;
		initUI();
        
        System.out.println("Entry Detail page created");		
	}
	
	public void initUI(){
		this.setSize(400, 500);
		JPanel mainPanel = new JPanel();

		GridLayout gLayout = new GridLayout(0,1);
		mainPanel.setLayout(gLayout);
        
		//Add a label to indicate whether this is an income or expense
		JLabel titleLabel = new JLabel(this.entryType);
		
        //Add the "Back/Cancel" button
        m_cancelButton = new JButton("Cancel");
        //Add the "Submit" button
        m_submitButton = new JButton("Submit");

		//Create an inner panel to hold detail of the report
		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(new GridLayout(0,2));
		
        //Add the "Name" label and textfield
        JLabel nameLabel = new JLabel("Name");
        m_nameTextField = new JTextField();

        //Add the "Balance" label and textfield
        JLabel balanceLabel = new JLabel("Balance");
        m_balanceTextField = new JTextField();
        
        //Add the "Date" label and textfield
        JLabel dateLabel = new JLabel("Date");
        m_dateTextField = new JTextField();
        
        //Add the "Recurring" label and radio button
        JLabel recurringLabel = new JLabel("Recurring Monthly?");
        m_recurringRadioButton = new JRadioButton("Yes");

        //Add the "Category" button and textfield
        JLabel categoryLabel = new JLabel("Category");
        m_categoryTextField = new JTextField();

        //Inner panel component added
        innerPanel.add(nameLabel);
        innerPanel.add(m_nameTextField);
        innerPanel.add(balanceLabel);
        innerPanel.add(m_balanceTextField);
        innerPanel.add(dateLabel);
        innerPanel.add(m_dateTextField);
        innerPanel.add(recurringLabel);
        innerPanel.add(m_recurringRadioButton);
        innerPanel.add(categoryLabel);
        innerPanel.add(m_categoryTextField);

        mainPanel.add(titleLabel);
        mainPanel.add(innerPanel);
        mainPanel.add(m_submitButton);
        mainPanel.add(m_cancelButton);
        
        this.add(mainPanel);
        this.setVisible(true);
	}

	/**
	 * Add cancelButton listener
	 * @param action
	 */
	public void addCancelButtonListener(ActionListener action){
		m_cancelButton.addActionListener(action);
	}
}
