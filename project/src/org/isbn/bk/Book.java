package org.isbn.bk;
import java.util.Date;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;*/

//@Entity
//@Table(name="Book_Details")
public class Book {
	



		// public static void main(String[] args) {
	//	@Id
		//@Column(name = "Book_Id",nullable=false,unique=true)
		//@GeneratedValue
		private int id;
		//@Column(name = "Author_name",nullable=false,unique=true)
		private String author ;
		//@Column(name = "Isbn_number")
		private String isbn;
		//@Column(name = "Publisher",length=150,nullable=false)
		private String publisher;
		//@Column(name = "Price")
		private double price;
		//@Temporal(TemporalType.DATE)
		private Date published;
		public Book(String author, String isbn, String publisher, double price, Date published) {
			super();
			this.author = author;
			this.isbn = isbn;
			this.publisher = publisher;
			this.price = price;
			this.published = published;
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
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
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
	
		

}
