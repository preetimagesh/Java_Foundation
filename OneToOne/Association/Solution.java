package collections;

import java.io.IOException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String a[]) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		sf.close();
	}
}
