/**
 * Package contains all the views required by budgetreporter
 */
package com.budgetreporter.View;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * This view display user's information and edit option.
 * This view can be used as new user registration
 * 
 * @author jacky
 *
 */
public class UserProfileView extends JPanel{
	
	private String viewTitle;

	public UserProfileView(String viewTitle){
		super();
		this.viewTitle = viewTitle;
		initUI();
	}
	
	public void initUI(){
		this.setLayout(new GridLayout(0,1));
		
		//Add title label
		JLabel viewTitleLabel = new JLabel(this.viewTitle);
		
		//Create mainPanel that contains profile information
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0,2));
		
		//Add "username" field
		JLabel usernameLabel = new JLabel("Username: ");
		JTextField usernameTextField = new JTextField();

		//Add "password" field
		JLabel passwordLabel = new JLabel("Password: ");
		JTextField passwordTextField = new JTextField();
		
		//Add "firstname" field
		JLabel firstnameLabel = new JLabel("First name: ");
		JTextField firstnameTextField = new JTextField();
		
		//Add "lastname" field
		JLabel lastnameLabel = new JLabel("Last name: ");
		JTextField lastnameTextField = new JTextField();

		//Add edit and submit buttons
		JButton editButton = new JButton("Edit");
		JButton submitButton = new JButton("Submit");
		
		//Add components to mainPanel
		mainPanel.add(usernameLabel);
		mainPanel.add(usernameTextField);
		mainPanel.add(firstnameLabel);
		mainPanel.add(firstnameTextField);
		mainPanel.add(lastnameLabel);
		mainPanel.add(lastnameTextField);
		mainPanel.add(editButton);
		mainPanel.add(submitButton);
		
		//Add components to the panel
		this.add(viewTitleLabel);
		this.add(mainPanel);
	}
}
