package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution1 {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i=0;
		while(i<2)
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
		  System.out.println("Enter basic salary : "); 
		  double basicSalary=Double.valueOf(bf.readLine());
		  System.out.println("Enter tavel allowance : "); 
		  int travelAllowance=Integer.valueOf(bf.readLine());
		  System.out.println("Enter hra : "); 
		  float houseRentAllowance=Float.valueOf(bf.readLine());
		  System.out.println("Enter da : "); 
		  float dearnessAllowance=Float.valueOf(bf.readLine());
		  System.out.println("Enter pf : "); 
		  float providentFund=Float.valueOf(bf.readLine());
		  //System.out.println("Enter Gender : "); //boolean
		 // gender=Boolean.valueOf(bf.readLine());
		  Employee employee=new Employee(email, name, phone,basicSalary,travelAllowance,dearnessAllowance,houseRentAllowance,providentFund);
		 // System.out.println("Id : "+employee.getId());
		  System.out.println("Name : "+employee.getName());
		  System.out.println("Email : "+employee.getEmail());
		  System.out.println("Phone : "+employee.getPhone());
		  System.out.println("basic sal : "+employee.getBasicSalary());
		  System.out.println("da : "+employee.getDearnessAllowance());
		  System.out.println("hra : "+employee.getHouseRentAllowance());
		  System.out.println("ta : "+employee.getTravelAllowance());
		  System.out.println("pf : "+employee.getProvidentFund());
		  //System.out.println("Gender : "+employee.isGender());
		  session.save(employee);
		  session.getTransaction().commit();
		}
		 
		session.close();
	}

}
