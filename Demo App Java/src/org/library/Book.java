package org.library;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Book {
	@Id
	@Column(name = "Book_Id")
	@GeneratedValue	
	private int bookId;
	@Column(name = "Author_Name")
	private String author;
	@Column(name = "Book_Title")
	private String title;
	@Column(name = "Book_Price")
	private int price;
	@Column(name = "Publication_year")
	private int year;
	@Column(name = "Book_Type")
	private String bookType;
	@Column(name = "Language")
	private String language;
	
	public Book(String author, String title, int price, int year, String bookType, String language) {
		super();
		//this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.price = price;
		this.year = year;
		this.bookType = bookType;
		this.language = language;
	}
		public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
