package org.isbn.bk;


import org.isbn.bk.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class MainClass {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i = 0;

		while (i < 3) {
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			/*System.out.print("Enter Book ID : ");
			int id = Integer.valueOf(bf.readLine());*/
			System.out.print("Enter Name : ");
			String name = bf.readLine();
			System.out.print("Enter Publisher : ");
			String publisher = bf.readLine();
			System.out.print("Enter Author Name : ");
			String author = bf.readLine();
			System.out.print("Enter Price : ");
			double price = Double.valueOf(bf.readLine());
			System.out.print("Enter Year of Publication : ");
			Date published = new Date(bf.readLine());
			System.out.print("Enter ISBN : ");
			String isbn = bf.readLine();
			Book book = new Book(name, publisher,author, price,published,isbn);
			System.out.println("Name : " + book.getName());
			System.out.println("Publisher: " + book.getPublisher());
			System.out.println("Author : " + book.getAuthor());
			System.out.println("Price : " + book.getPrice());
			System.out.println("Published : " + book.getPublished());
			System.out.println("ISBN_NO : " + book.getIsbn());
			session.save(book);
			session.getTransaction().commit();
			i++;
		}
		// sf.close();
		session.close();


	}

}