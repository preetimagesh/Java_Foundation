package com.veh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class VehicleMain {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Vehicle vehicle = new Vehicle();
		vehicle.setName("car");

		TwoWheeler two = new TwoWheeler();
		two.setName("Bike");
		two.setSteeringHandle("Bike Steering Handle");

		FourWheeler four = new FourWheeler();
		four.setName("Porsche");
		four.setSteeringWheel("Porsche Steering Wheel");
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}