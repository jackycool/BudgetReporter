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
public class LoginView extends JFrame{
	
	public LoginView(){
		super("User Login");
		initUI();
	}
	
	public void initUI(){
        //Create and set up the window.
        Container contentPane = this.getContentPane();
        JPanel panel = new JPanel();
        contentPane.add(panel);
        
        panel.setLayout(null);

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
        
        panel.add(loginLabel);
        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordTextField);
        panel.add(loginButton);
        
        this.setSize(300, 200);
        this.setLocation(10, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Login page created");		
	}
}
