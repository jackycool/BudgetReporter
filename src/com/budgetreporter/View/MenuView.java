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

	// Components
	private JPanel contentPane;
    private JButton m_viewReportButton;
    private JButton m_newExpenseButton;
    private JButton m_newIncomeButton;
    private JButton m_viewProfileButton;
    private JButton m_quitButton;

    public MenuView(JPanel contentPane){
		super();
		this.contentPane = contentPane;
		initUI();
        System.out.println("Menu page created");		
	}
	
    /**
     * Initialise all UI components of the view
     */
	public void initUI(){
		GridLayout gLayout = new GridLayout(0,1);
		this.setLayout(gLayout);
		
		// Initialise UI components
		m_viewReportButton = new JButton("View Report");
		m_newExpenseButton = new JButton("New Expense");
		m_newIncomeButton = new JButton("New Income");
		m_viewProfileButton = new JButton("Profile");
		m_quitButton = new JButton("Quit");
		
		// Add components
        this.add(m_viewReportButton);
        this.add(m_newExpenseButton);
        this.add(m_newIncomeButton);
        this.add(m_viewProfileButton);
        this.add(m_quitButton);
        
	}
	
	/**
	 * Return the current contentPane
	 * @return contentPane
	 */
	public JPanel getContentPane(){
		return this.contentPane;
	}
	
	/**
	 * Add viewReportButton listener
	 * @param viewReport
	 */
	public void addViewReportButtonListener(ActionListener viewReportAction){
		m_viewReportButton.addActionListener(viewReportAction);
	}
	
	/**
	 * Add newExpenseButton listener
	 * @param newExpenseAction
	 */
	public void addNewExpenseButtonListener(ActionListener newExpenseAction){
		m_newExpenseButton.addActionListener(newExpenseAction);
	}

	/**
	 * Add newIncomeButton listener
	 * @param newIncomeAction
	 */
	public void addNewIncomeButtonListener(ActionListener newIncomeAction){
		m_newIncomeButton.addActionListener(newIncomeAction);
	}

	/**
	 * Add viewProfileButton listener
	 * @param viewProfileAction
	 */
	public void addViewProfileActionListener(ActionListener viewProfileAction){
		m_viewProfileButton.addActionListener(viewProfileAction);
	}

	/** 
	 * Add quit button listener
	 * @param quit
	 */
	public void addQuitButtonListener(ActionListener quit){
		m_quitButton.addActionListener(quit);
	}
}
