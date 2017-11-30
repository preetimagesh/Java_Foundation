package org.library;

public class Date {
	private String dueDate;
	private String returnDate;
	private String issueDate;
	private float fine;
	public Date(String dueDate, String returnDate, String issueDate, float fine) {
		super();
		this.dueDate = dueDate;
		this.returnDate = returnDate;
		this.issueDate = issueDate;
		this.fine = fine;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public float getFine() {
		return fine;
	}
	public void setFine(float fine) {
		this.fine = fine;
	}
	
	
}