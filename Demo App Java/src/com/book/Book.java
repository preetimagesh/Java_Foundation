package com.book;

public class Book {
private int id;
private String title; 
private String author;
private double price;
private long isbnNumber;
public Book(String title, String author, double price, long isbnNumber) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
	this.isbnNumber = isbnNumber;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
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
public long getIsbnNumber() {
	return isbnNumber;
}
public void setIsbnNumber(long isbnNumber) {
	this.isbnNumber = isbnNumber;
}

}