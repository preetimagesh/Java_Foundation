package org.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i = 0;

		while (i < 3) {
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter Title: ");
			String title = bf.readLine();
			System.out.print("Enter Author : ");
			String author = bf.readLine();
			System.out.print("Enter Price : ");
			int price = Integer.valueOf(bf.readLine());
			System.out.print("Enter Year of Publication : ");
			int year = Integer.valueOf(bf.readLine());
			System.out.print("Enter Book Type : ");
			String bookType = bf.readLine();
			System.out.print("Enter Language : ");
			String language = bf.readLine();
			Book book = new Book(title, author, price, year, bookType, language);
			session.save(book);
			session.getTransaction().commit();
			i++;
		}
		// sf.close();
		session.close();

	}

}