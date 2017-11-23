package org.grocery.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solutions {

	public static void main(String a[]) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		// session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("enter choice :");
			int ch = Integer.parseInt(bf.readLine());

			switch (ch) {
			case 1:

				Item item = new Item();
				session.beginTransaction();
				System.out.println("Enter Item_Name : ");
				String name = bf.readLine();
				System.out.println("Enter quantity : ");
				int quantity = Integer.parseInt(bf.readLine());
				System.out.println("Enter price : ");
				double price = Double.valueOf(bf.readLine());
				item.setName(name);
				item.setPrice(price);
				item.setQuantity(quantity);
				session.save(item);
				session.getTransaction().commit();
				break;
			case 2:
				Item item1 = session.get(Item.class, 1);
				System.out.println(item1.getName());
				break;
			case 3:

				Item item2 = session.get(Item.class, 3);
				session.beginTransaction();
				System.out.println(item2.getName());
				item2.setName("inkbottle");
				item2.setPrice(27);
				session.update(item2);
				session.getTransaction().commit();
				System.out.println("Updated");
				break;
			case 4:
				session.beginTransaction();
				Item item3 = new Item();
				item3.setId(1);
				session.delete(item3);
				session.getTransaction().commit();
				break;
			case 5:
				System.out.println("Total No of products: " + Item.getTotalNoOfProducts());
				break;
			case 6:
				System.out.println("EXITING");
				System.exit(0);
			default:
				break;

			}
		}

	}

}
