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
	
	private MenuView _menuView;

	public MenuViewController(MenuView menu){
		_menuView = menu;
		
		// Add listeners to the buttons
		_menuView.addViewReportButtonListener(new ViewReportButtonListener());
		_menuView.addNewExpenseButtonListener(new FileExpenseButtonListener());
		_menuView.addNewIncomeButtonListener(new FileIncomeButtonListener());
		_menuView.addViewProfileActionListener(new viewProfileButtonListener());
		_menuView.addQuitButtonListener(new QuitButtonListener());

		System.out.println("Created MenuViewController");
	}

	/***************************************************************************
	 * Inner class of MenuViewController                                       *
	 **************************************************************************/
	/**
	 * When viewReportButton is clicked, dispose current view and bring up the
	 * reportDetailView page up
	 */
	private class ViewReportButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("viewReportButton clicked");
			//TODO: viewReportButtonAction
			JPanel contentPane = _menuView.getContentPane();
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
	
	private class viewProfileButtonListener implements ActionListener{
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
