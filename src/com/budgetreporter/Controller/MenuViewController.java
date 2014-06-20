/**
 * Package contains all the controller the application needs
 */
package com.budgetreporter.Controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.budgetreporter.View.EntryDetailView;
import com.budgetreporter.View.MenuView;

public class MenuViewController {
	
	private MenuView m_menuView;
	private JFrame m_mainFrame;

	public MenuViewController(MenuView menu, JFrame frame){
		m_menuView = menu;
		m_mainFrame = frame;
		
		// Add listeners to the buttons
		m_menuView.addViewReportButtonListener(new ViewReportButtonListener());
		m_menuView.addNewExpenseButtonListener(new FileExpenseButtonListener());
		m_menuView.addNewIncomeButtonListener(new FileIncomeButtonListener());
		m_menuView.addViewProfileActionListener(new ViewProfileButtonListener());
		m_menuView.addQuitButtonListener(new QuitButtonListener());

		System.out.println("Created MenuViewController");
	}

	/***************************************************************************
	 * Inner class of MenuViewController                                       *
	 **************************************************************************/
	/**
	 * When viewReportButton is clicked, switch ReportDetailView panel
	 */
	private class ViewReportButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("viewReportButton clicked");
			JPanel contentPane = m_menuView.getContentPane();
			CardLayout cardLayout = (CardLayout) contentPane.getLayout();
            cardLayout.show(contentPane, "ReportMenuView");
		}
	}
	
	private class FileExpenseButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("newExpenseButton clicked");
			
			m_mainFrame.setVisible(false);
			EntryDetailView newExpense = new EntryDetailView("New Expense");
			EntryDetailViewController entryControl = 
					new EntryDetailViewController(newExpense, m_mainFrame);
		}
	}
	
	private class FileIncomeButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("newIncomeButton clicked");

			m_mainFrame.setVisible(false);
			EntryDetailView newIncome = new EntryDetailView("New Income");
			EntryDetailViewController entryControl = 
					new EntryDetailViewController(newIncome, m_mainFrame);
		}
	}
	
	/**
	 * When viewProfileButton is clicked, switch UserProfileView panel
	 */
	private class ViewProfileButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("viewProfileButton clicked");
			//TODO: viewProfileButtonAction
		}
	}
	
	/**
	 * Exit the application when "Quit" button is clicked
	 */
	private class QuitButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Quit Button Clicked and quiting");
		    System.exit(0);
		}
	}
}
