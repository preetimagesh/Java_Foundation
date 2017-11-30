package com.book;

public class EBook extends Book {
private String downloadUrl;
private int sizeInMb;
public EBook() {
	super();
	// TODO Auto-generated constructor stub
}
public EBook(String title, String author, double price, long isbnNumber) {
	super(title, author, price, isbnNumber);
	// TODO Auto-generated constructor stub
}
public EBook(String title, String author, double price, long isbnNumber, String downloadUrl, int sizeInMb) {
	super(title, author, price, isbnNumber);
	this.downloadUrl = downloadUrl;
	this.sizeInMb = sizeInMb;
}
public String getDownloadUrl() {
	return downloadUrl;
}
public void setDownloadUrl(String downloadUrl) {
	this.downloadUrl = downloadUrl;
}
public int getSizeInMb() {
	return sizeInMb;
}
public void setSizeInMb(int sizeInMb) {
	this.sizeInMb = sizeInMb;
}

}
