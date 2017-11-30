package com.book;

public class PaperBook extends Book {
private double shippingWeight;
private int inStock;
public PaperBook() {
	super();
	// TODO Auto-generated constructor stub
}
public PaperBook(String title, String author, double price, long isbnNumber) {
	super(title, author, price, isbnNumber);
	// TODO Auto-generated constructor stub
}
public PaperBook(String title, String author, double price, long isbnNumber, double shippingWeight,
		int inStock) {
	super(title, author, price, isbnNumber);
	this.shippingWeight = shippingWeight;
	this.inStock = inStock;
}
public double getShippingWeight() {
	return shippingWeight;
}
public void setShippingWeight(double shippingWeight) {
	this.shippingWeight = shippingWeight;
}
public int getInStock() {
	return inStock;
}
public void setInStock(int inStock) {
	this.inStock = inStock;
}

}