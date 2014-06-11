/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.Container;

import javax.swing.*; 

/**
 * @author jacky
 *
 */
public class LoginView extends JPanel{
	
	public LoginView(){
        //Create and set up the panel.
		super();
		initUI();
	}
	
	public void initUI(){
        this.setLayout(null);

        //Add the "login" label
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(0, 0, 100, 20);
        
        //Add the "Username" label
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(0, 40, 100, 20);

        //Add the "Username" Textfield
        JTextField usernameTextField = new JTextField();
        usernameTextField.setEditable(true);
        usernameTextField.setBounds(100, 40, 100, 20);
        
        //Add the "password" label
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(0, 60, 100, 20);
        
        //Add the "password" Textfield
        JTextField passwordTextField = new JTextField();
        passwordTextField.setEditable(true);
        passwordTextField.setBounds(100, 60, 100, 20);

        //Add the "login" button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(180, 100, 100, 30);
        
        this.add(loginLabel);
        this.add(usernameLabel);
        this.add(usernameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(loginButton);
        
        System.out.println("Login page created");		
	}
}
