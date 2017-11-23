package com.veh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class VehicleMain {

	public static void main(String a[]) throws IOException
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Vehicle vehicle=new Vehicle();
		vehicle.setName("car");
		
		TwoWheeler two=new TwoWheeler();
		two.setName("Bike");
		two.setSteeringHandle("Bike steering handle");
		
		/*TwoWheeler two1=new TwoWheeler();
		System.out.println("enter name");
		two1.setName(bf.readLine());
		two1.setSteeringHandle("Bike3 steering handle");
		System.out.println("name is: "+two1.getName());*/
		
		FourWheeler four=new FourWheeler();
		four.setName("Porsche");
		four.setSteeringWheel("Porsche steering wheel");
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
