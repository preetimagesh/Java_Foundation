package org.grocery.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GroceryMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		/*Item item = session.get(Item.class, 3);
		System.out.println("Item Name : " + item.getName());
		System.out.println("Item Quantity : " + item.getQuantity());
		System.out.println("Item Price : " + item.getPrice());
		session.beginTransaction();
		item.setName("Paste");
		item.setPrice(10);
		session.update(item);
		session.getTransaction().commit();
		System.out.println("Updated");*/
		/*session.beginTransaction();
		Item item = new Item();
		item.setId(2);
		session.delete(item);
		session.getTransaction().commit();
		System.out.println("Deleted")*/;
		while (true) {
			
			System.out.print("1.Insert \n 2.Select \n 3.Update \n 4.Delete \n 5.Total number of Products \n 6.Search \n 7.Exit \n Enter Choice : ");
			int choice = Integer.valueOf(bf.readLine());
			switch (choice) {
			case 1:
				Item item = new Item();

				session.beginTransaction();
				System.out.print("Enter Name : ");
				String name = bf.readLine();
				System.out.print("Enter Quantity : ");
				int quantity = Integer.valueOf(bf.readLine());
				System.out.print("Enter Price : ");
				double price = Double.valueOf(bf.readLine());
				item.setName(name);
				item.setPrice(price);
				item.setQuantity(quantity);
				System.out.println("Item Name : " + item.getName());
				System.out.println("Item Quantity : " + item.getQuantity());
				System.out.println("Item Price : " + item.getPrice());
				session.save(item);
				session.getTransaction().commit();
				break;
			case 2:
				Item item1 = session.get(Item.class, 3);
				System.out.println("Item Name : " + item1.getName());
				System.out.println("Item Quantity : " + item1.getQuantity());
				System.out.println("Item Price : " + item1.getPrice());
				break;
			case 3:
				Item item2 = session.get(Item.class, 4);
				session.beginTransaction();
				item2.setName("Brush");
				item2.setPrice(10);
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
				System.out.println("Deleted");
				break;
			case 5:
				System.out.println(Item.getTotalNoOfProducts());
				break;
			case 6:
				
				System.out.println("Enter Id to search : ");
				int searchId=Integer.valueOf(bf.readLine());
				System.out.println("Searching...");
				Item item4 = session.get(Item.class, searchId);
				System.out.println("Item Name : " + item4.getName());
				System.out.println("Item Quantity : " + item4.getQuantity());
				System.out.println("Item Price : " + item4.getPrice());
				break;
			case 7:
				System.out.println("Exited");
				System.exit(0);
			default:
				break;
			}
		}

	}

}