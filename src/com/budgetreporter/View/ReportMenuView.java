/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author jacky
 *
 */
public class ReportMenuView extends JPanel{
	
	public ReportMenuView(){
		super();
		initUI();
	}
	
	public void initUI(){
		GridLayout gLayout = new GridLayout(0,1);
		this.setLayout(gLayout);
        
        //Add the "View Monthly Report" button
        JButton viewMonthlyReportButton = new JButton("View Monthly Report");

        //Add the "New Annual Report" button
        JButton viewAnnualReportButton = new JButton("View Annual Report");
        
        //Add the "Back" button
        JButton backButton = new JButton("Back");

        this.add(viewMonthlyReportButton);
        this.add(viewAnnualReportButton);
        this.add(backButton);
        
        System.out.println("Report Menu page created");		
	}

}
