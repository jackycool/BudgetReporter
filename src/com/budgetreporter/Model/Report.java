/**
 * Package contains all user models
 */
package com.budgetreporter.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Report class that stores specific piece of report, can be either monthly or 
 * annually.
 * 
 * @author Jacky
 */
public class Report {

	private String reportType;
	private ArrayList<Income> incomeList;
	private ArrayList<Expense> expenseList;
	private Date date;
	private float totalBalance;
	
	/**
	 * Report class constructor
	 */
	public Report(){
		
	}

	/* Getter function for reportType */
	public String getReportType() {
		return reportType;
	}

	/* Setter function for reportType */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	/* Getter function for date */
	public Date getDate() {
		return date;
	}

	/* Setter function for date */
	public void setDate(Date date) {
		this.date = date;
	}

	/* Getter function for income list */
	public ArrayList<Income> getIncomeList() {
		return incomeList;
	}

	/* Getter function for expense list */
	public ArrayList<Expense> getExpenseList() {
		return expenseList;
	}

}
