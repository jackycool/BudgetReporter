/**
 * Package contains all the controller the application needs
 */
package com.budgetreporter.Controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.budgetreporter.View.LoginView;

/**
 * Controller class for LoginView
 * 
 * @author jacky
 */
public class LoginViewController {
	
	private LoginView m_loginView;

	public LoginViewController(LoginView view){
		m_loginView = view;
		
		// Add listener to the button
		m_loginView.addLoginButtonListener(new LoginButtonListener());
		
		System.out.println("LoginViewController is created");
	}
	
	/***************************************************************************
	 * Inner class of LoginViewController                                      *
	 **************************************************************************/
	/**
	 * When loginButton is clicked, switch MenuView panel
	 */
	private class LoginButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("login Button is clicked");
			JPanel contentPane = m_loginView.getContentPane();
			CardLayout cardLayout = (CardLayout) contentPane.getLayout();
            cardLayout.show(contentPane, "MenuView");
		}
	}
}
