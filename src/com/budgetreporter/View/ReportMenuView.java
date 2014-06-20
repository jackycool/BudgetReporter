/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Report Menu UI
 * 
 * @author jacky
 *
 */
public class ReportMenuView extends JPanel{
	
	private JPanel contentPane;
	private JButton m_viewMonthlyReportButton;
	private JButton m_viewAnnualReportButton;
	private JButton m_backButton;
	
	public ReportMenuView(JPanel contentPane){
		super();
		this.contentPane = contentPane;
		initUI();
	}
	
	/**
	 * Initialise all the UI components
	 */
	public void initUI(){
		GridLayout gLayout = new GridLayout(0,1);
		this.setLayout(gLayout);
        
        //Add the "View Monthly Report" button
        m_viewMonthlyReportButton = new JButton("View Monthly Report");

        //Add the "New Annual Report" button
        m_viewAnnualReportButton = new JButton("View Annual Report");
        
        //Add the "Back" button
        m_backButton = new JButton("Back");

        this.add(m_viewMonthlyReportButton);
        this.add(m_viewAnnualReportButton);
        this.add(m_backButton);
        
        System.out.println("Report Menu page created");		
	}
	
	/**
	 * Return the current contentPane
	 * @return contentPane
	 */
	public JPanel getContentPane(){
		return this.contentPane;
	}

	/**
	 * Add button listener for viewMonthlyReportButton
	 * @param action
	 */
	public void addViewMonthlyReportButtonListener(ActionListener action){
		m_viewMonthlyReportButton.addActionListener(action);
	}

	/**
	 * Add button listener for viewAnnualReportButton
	 * @param action
	 */
	public void addViewAnnualReportButtonListener(ActionListener action){
		m_viewAnnualReportButton.addActionListener(action);
	}

	/**
	 * Add button listener for backButton
	 * @param action
	 */
	public void addBackButtonListener(ActionListener action){
		m_backButton.addActionListener(action);
	}
}
