package com.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookMain {
	public static void main(String a[]) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i = 0;
		while (i < 2) {
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter title : ");
			String title = bf.readLine();
			System.out.println("Enter author");
			String author = bf.readLine();
			System.out.println("Enter price : ");
			double price = Double.parseDouble(bf.readLine());
			System.out.println("Enter isbn No : ");
			long isbnNumber = Long.parseLong(bf.readLine());
			System.out.println("Enter 1 for ebook\n 2 for paper Book");
			int choice = Integer.parseInt(bf.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter the url to download the book");
				String downloadUrl = bf.readLine();
				System.out.println("Enter the size in mb");
				int sizeInMb = Integer.parseInt(bf.readLine());
				EBook ebook = new EBook(title, author, price, isbnNumber, downloadUrl, sizeInMb);
				System.out.println("Id : " + ebook.getId());
				System.out.println("Title : " + ebook.getTitle());
				System.out.println("Author : " + ebook.getAuthor());
				System.out.println("Price : " + ebook.getPrice());
				System.out.println("isbn no : " + ebook.getIsbnNumber());
				System.out.println("Download url : " + ebook.getDownloadUrl());
				System.out.println("Size in mb : " + ebook.getSizeInMb());
				session.save(ebook);
				break;
			case 2:
				System.out.println("Enter shipping weight");
				Double shippingWeight = Double.valueOf(bf.readLine());
				System.out.println("Enter instock no : ");
				int inStock = Integer.parseInt(bf.readLine());
				PaperBook paperbook = new PaperBook(title, author, price, isbnNumber, shippingWeight, inStock);
				System.out.println("Id : " + paperbook.getId());
				System.out.println("Title : " + paperbook.getTitle());
				System.out.println("Author : " + paperbook.getAuthor());
				System.out.println("Price : " + paperbook.getPrice());
				System.out.println("isbn no : " + paperbook.getPrice());
				System.out.println("Shipping weight : " + paperbook.getShippingWeight());
				System.out.println("in stock : " + paperbook.getInStock());
				session.save(paperbook);
				break;
			}
			session.getTransaction().commit();
			i++;
		}
		session.close();
	}
}