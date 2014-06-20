/**
 * Package contains all the controller the application needs
 */
package com.budgetreporter.Controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.budgetreporter.View.ReportMenuView;

/**
 * Controller class for ReportMenuView
 * 
 * @author jacky
 *
 */
public class ReportMenuViewController {
	
	private ReportMenuView m_reportMenuView;

	public ReportMenuViewController(ReportMenuView view){
		m_reportMenuView = view;
		
		// Add listener to the button
		m_reportMenuView.addBackButtonListener(new BackButtonListener());
		
		System.out.println("ReportMenuViewController is created");
	}
	
	/***************************************************************************
	 * Inner class of ReportMenuViewController                                 *
	 **************************************************************************/
	/**
	 * When backButton is clicked, switch MenuView panel
	 */
	private class BackButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("back Button is clicked");
			JPanel contentPane = m_reportMenuView.getContentPane();
			CardLayout cardLayout = (CardLayout) contentPane.getLayout();
            cardLayout.show(contentPane, "MenuView");
		}
	}

}
