package org.main2;
import org.isbn.bk.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Solution2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i=0;
		
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		 while(i<2)
		{	
		i++;
		 
		//  System.out.println("Enter Id : "); int
		
		//id=Integer.valueOf(bf.readLine());
		
		  System.out.println("Enter Author_name : "); 
		  String author=bf.readLine();
		  System.out.println("Enter isbn : ");
		  String isbn=bf.readLine();
		  System.out.println("Enter price : "); 
		  double price=Double.valueOf(bf.readLine());
		  System.out.println("Enter publisher : ");
		  String publisher=bf.readLine();
		  System.out.println("Enter date : ");
		  Date published=new Date(bf.readLine());
		  Book book=new Book(author,isbn,publisher,price,published);
		  System.out.println("Id : "+book.getId());
		  System.out.println("Name : "+book.getAuthor());
		  System.out.println("isbn no : "+book.getIsbn());
		  System.out.println("publisher : "+book.getPublisher());
		  System.out.println("price : "+book.getPrice());
		  System.out.println("date : "+book.getPublished());
		 
		  session.save(book);
		  session.getTransaction().commit();
		}
		 
		sf.close();
		session.close();
	}

}

