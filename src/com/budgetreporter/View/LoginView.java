/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*; 

/**
 * @author jacky
 *
 */
public class LoginView extends JPanel{
	
	private JPanel contentPane;
	private JLabel m_loginLabel;
	private JLabel m_usernameLabel;
	private JTextField m_usernameTextField;
	private JLabel m_passwordLabel;
	private JTextField m_passwordTextField;
	private JButton m_loginButton;
	
	public LoginView(JPanel contentPane){
        //Create and set up the panel.
		super();
		this.contentPane = contentPane;
		initUI();
		System.out.println("LoginView created");
	}
	
	public void initUI(){
		GridLayout gLayout = new GridLayout(0,1);
		this.setLayout(gLayout);

		//Add the "login" label
        m_loginLabel = new JLabel("Login");
		
		JPanel innerPanel = new JPanel();
		GridLayout innerLayout = new GridLayout(0,2);
		innerPanel.setLayout(innerLayout);
		
        //Add the "Username" label
        m_usernameLabel = new JLabel("Username: ");
        //Add the "Username" Textfield
        m_usernameTextField = new JTextField();
        m_usernameTextField.setEditable(true);
        //Add the "password" label
        m_passwordLabel = new JLabel("Password: ");
        //Add the "password" Textfield
        m_passwordTextField = new JTextField();
        m_passwordTextField.setEditable(true);
        //Add the "login" button
        m_loginButton = new JButton("Login");
        
        //Adding components to inner container
        innerPanel.add(m_usernameLabel);
        innerPanel.add(m_usernameTextField);
        innerPanel.add(m_passwordLabel);
        innerPanel.add(m_passwordTextField);
        
        // Adding components to outer container
        this.add(m_loginLabel);
        this.add(innerPanel);
        this.add(m_loginButton);
        
        System.out.println("Login page created");		
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
	public void addLoginButtonListener(ActionListener loginAction){
		m_loginButton.addActionListener(loginAction);
	}

}
