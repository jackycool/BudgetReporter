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
	
	private String username;
	private int uid;
	private String lastname;
	private String firstname;
	
	// Class constructor
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

	/* Getter function for uid */
	public int getUid() {
		return uid;
	}

	/* Setter function for uid */
	public void setUid(int uid) {
		this.uid = uid;
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