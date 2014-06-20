/**
 * Package contains all the controller the application needs
 */
package com.budgetreporter.Controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.budgetreporter.View.MenuView;

public class MenuViewController {
	
	private MenuView m_menuView;

	public MenuViewController(MenuView menu){
		m_menuView = menu;
		
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
			//TODO: newExpenseButtonAction
		}
	}
	
	private class FileIncomeButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("newIncomeButton clicked");
			//TODO: newIncomeButtonAction 
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
