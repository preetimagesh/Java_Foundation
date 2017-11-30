package org.isbn.bk;

import java.util.Date;

public class Book {

	private int bookId;
	private String name;
	private String publisher;
	private String author;
	private double price;
	private Date published;
	private String isbn;

	public Book(String name, String publisher, String author, double price, Date published, String isbn) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.published = published;
		this.isbn = isbn;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}