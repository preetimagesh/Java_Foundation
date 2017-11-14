package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i=0;
		while(i<3)
		{	
		i++;
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		 // System.out.println("Enter Id : "); int
		//id=Integer.valueOf(bf.readLine());
		
		  System.out.println("Enter email : "); 
		  String email=bf.readLine();
		  System.out.println("Enter name : ");
		  String name=bf.readLine();
		  System.out.println("Enter ph number : "); 
		  int phone=Integer.valueOf(bf.readLine());
		  //System.out.println("Enter Gender : "); //boolean
		 // gender=Boolean.valueOf(bf.readLine());
		  Employee employee=new Employee(email, name, phone);
		 // System.out.println("Id : "+employee.getId());
		  System.out.println("Name : "+employee.getName());
		  System.out.println("Email : "+employee.getEmail());
		  System.out.println("Phone : "+employee.getPhone());
		  //System.out.println("Gender : "+employee.isGender());
		  session.save(employee);
		  session.getTransaction().commit();
		}
		 
		sf.close();
		session.close();
	}

}
