/**
 * Package contains all user models
 */
package com.budgetreporter.Model;

/**
 * User class that stores the information of a typical user
 * 
 * @author Jacky
 *
 */
public class User {
	
	private int user_id;
	private String username;
	private String password;
	private String lastname;
	private String firstname;
	
	/**
	 * User class constructor
	 */
	public User(){
	}
	
	/* Getter function for username */
	public String getUsername() {
		return username;
	}

	/* Setter function for username */
	public void setUsername(String username) {
		this.username = username;
	}

	/* Getter function for password */
	public String getPassword() {
		return password;
	}

	/* Setter function for password */
	public void setPassword(String password) {
		this.password = password;
	}

	/* Getter function for uid */
	public int getUser_id() {
		return user_id;
	}

	/* Setter function for uid */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/* Getter function for lastname */
	public String getLastname() {
		return lastname;
	}

	/* Setter function for lastname */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/* Getter function for firstname */
	public String getFirstname() {
		return firstname;
	}

	/* Setter function for firstname */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}