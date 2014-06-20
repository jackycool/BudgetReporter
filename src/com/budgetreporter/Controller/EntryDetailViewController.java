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

/**
 * Controller class for EntryDetailView
 *
 * @author jacky
 *
 */
public class EntryDetailViewController {
	
	private EntryDetailView m_view;
	private JFrame m_mainFrame;
	
	public EntryDetailViewController(EntryDetailView view, JFrame frame){
		m_view = view;
		m_mainFrame = frame;
		
		// Add listeners to buttons
		m_view.addCancelButtonListener(new CancelButtonListener());
		
		System.out.println("EntryDetailViewController is created");
	}
	
	/***************************************************************************
	 * Inner class of MenuViewController                                       *
	 **************************************************************************/
	private class CancelButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("Cancel button is clicked");
			m_mainFrame.setVisible(true);
			m_view.dispose();
		}
	}

}
