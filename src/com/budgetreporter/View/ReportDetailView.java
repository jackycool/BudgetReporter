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
 * This view contains detail information in a report, for example total_income,
 * total_expense, balance, source of income and source of expenses
 * 
 * @author jacky
 *
 */
public class ReportDetailView extends JPanel{
	
	private String reportType;
	
	public ReportDetailView(String reportType){
		super();
		this.reportType = reportType;
		initUI();
	}

	public void initUI(){
		GridLayout gLayout = new GridLayout(0,1);
		this.setLayout(gLayout);
        
		//Add a label to indicate whether this is a monthly or annual report
		JLabel titleLabel = new JLabel(this.reportType+" Report");
		
        //Add the "Back/Cancel" button
        JButton backButton = new JButton("Back");

		//Create an summary panel to hold summary of the report
		JPanel summaryPanel = new JPanel();
		summaryPanel.setLayout(new GridLayout(0,2));
		
		JLabel totalIncomeLabel = new JLabel("Total Income: ");
		JTextField totalIncomeTextField = new JTextField();
		totalIncomeTextField.setEditable(false);
		summaryPanel.add(totalIncomeLabel);
		summaryPanel.add(totalIncomeTextField);
		
		JLabel totalExpenseLabel = new JLabel("Total Expense: ");
		JTextField totalExpenseTextField = new JTextField();
		totalExpenseTextField.setEditable(false);
		summaryPanel.add(totalExpenseLabel);
		summaryPanel.add(totalExpenseTextField);

		JLabel balanceLabel = new JLabel("Total Balance: ");
		JTextField balanceTextField = new JTextField();
		balanceTextField.setEditable(false);
		summaryPanel.add(balanceLabel);
		summaryPanel.add(balanceTextField);

		//Create an income panel to hold summary of the income parts
		JPanel incomePanel = new JPanel();
		incomePanel.setLayout(new GridLayout(0,2));
		
		//Create an expense panel to hold summary of the expense parts
		JPanel expensePanel = new JPanel();
		expensePanel.setLayout(new GridLayout(0,2));
		
		this.add(titleLabel);
        this.add(summaryPanel);
        this.add(incomePanel);
        this.add(expensePanel);
        this.add(backButton);
        
        System.out.println("Report Detail page created");		
	}
	
}
