/**
 * Package contains database opration related for BudgetReporter
 */
package com.budgetreporter.DB;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DBOperations
 * 
 * Performs all the operations related to the database
 * 
 * @author jacky
 *
 */
public class DBOperations {
	
	//Server defined parameters
	private final String _USERNAME = "APP_DATA";
	private final String _PASSWORD = "asdf";
	private final String _HOST_NAME = "localhost";
	private final String _PORT = "1521";
	private final String _DB_NAME = "budgetreport";
	
	private Connection _con;
	
	/**
	 * Constructor class for DBOperations
	 */
	public DBOperations(){
		try {
			_con = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+_HOST_NAME+":"+_PORT+":"+_DB_NAME,
			        _USERNAME,
			        _PASSWORD);
		} catch (SQLException e) {
			// SQL connection error
			e.printStackTrace();
		}
	}
	
	/**
	 * CreateTableUsers
	 * 
	 * Create Users table in the database. 
	 */
	public void createTableUsers() {

		try {
//			DatabaseMetaData md = _con.getMetaData();
//			ResultSet rs = md.getTables(null, "APP_DATA", "Users", null);
//			while (rs.next()){
//				System.out.println(rs.getString("TABLE_NAME")+"Table exists!");
//			}
			
		    Statement stmt = _con.createStatement();
		    String queryString = 
		    		"CREATE TABLE Users "+
		    			"(user_id INTEGER NOT NULL, "+
		    			"username VARCHAR2(30) NOT NULL, "+
		    			"first_name VARCHAR2(30) NOT NULL, "+
		    			"last_name VARCHAR2(30) NOT NULL, "+
		    			"PRIMARY KEY (user_id) VALIDATE, "+
		    			"UNIQUE (username) VALIDATE)";
		    stmt.execute(queryString);
		    
		    System.out.println("Table created: Users");
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * CreateTableExpense
	 * 
	 * Create Expense table in the database. 
	 */
	public void CreateTableExpense() {

		try {
		    Statement stmt = _con.createStatement();
		    String queryString = 
		    		"CREATE TABLE Expense "+
		    			"(user_id INTEGER NOT NULL, "+
		    			"expense_id INTEGER NOT NULL, "+
		    			"expense_name VARCHAR2(30), "+
		    			"expense_date DATE, "+
		    			"category VARCHAR2(30), "+
		    			"recurring CHAR CHECK(recurring in ('N', 'Y')), "+
		    			"balance NUMBER NOT NULL, "+
		    			"PRIMARY KEY (expense_id) VALIDATE, "+
		    			"CONSTRAINT fk_user_id_expense "+
		    				"FOREIGN KEY (user_id) "+
		    				"REFERENCES Users(user_id))";
		    stmt.execute(queryString);
		    
		    System.out.println("Table created: Expense");
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * CreateTableIncome
	 * 
	 * Create Income table in the database. 
	 */
	public void CreateTableIncome() {

		try {
		    Statement stmt = _con.createStatement();
		    String queryString = 
		    		"CREATE TABLE Income "+
		    			"(user_id INTEGER NOT NULL, "+
		    			"income_id INTEGER NOT NULL, "+
		    			"income_name VARCHAR2(30), "+
		    			"income_date DATE, "+
		    			"recurring CHAR CHECK(recurring in ('N', 'Y')), "+
		    			"balance NUMBER NOT NULL, "+
		    			"PRIMARY KEY (income_id) VALIDATE, "+
		    			"CONSTRAINT fk_user_id_income "+
		    				"FOREIGN KEY (user_id) "+
		    				"REFERENCES Users(user_id))";
		    stmt.execute(queryString);
		    
		    System.out.println("Table created: Income");
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * connectToAndQueryDatabaseTest
	 * 
	 * Perform a select statement to query database
	 */
	public void connectToAndQueryDatabaseTest() {

		try {
		    Statement stmt = _con.createStatement();
		    String query = 
		    		"SELECT * FROM HR.EMPLOYEES";
		    ResultSet rs = stmt.executeQuery(query);
		    while (rs.next()) {
		    	String firstName = rs.getString("FIRST_NAME");
		    	String lastName = rs.getString("LAST_NAME");
			    System.out.println(firstName +"\t" +lastName);
	        }
		    
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
