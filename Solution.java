package org.aishu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;






public class Solution {

	public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the ad type ");
				String type = br.readLine();
				SessionFactory fs = new Configuration().configure().buildSessionFactory();
				Session session = fs.openSession();
				session.beginTransaction();

					Hotel_rooms m = new Hotel_rooms();
					m.setRoom_status("available");
					m.setRoom_category("ac");
					m.setRoom_capacity(4);
					m.setRoom_charge(4000);
					m.setRoom_facility("double bedroom");
					m.setRoom_no(1);
					session.save(m);
					
					
					
					Customer_request c = new Customer_request();
					c.setRoom_capacity(4);
					c.setRoom_facility("ac");
					c.setRoom_capacity(2);
					session.save(c);
					
					
					Customer_details c1 = new Customer_details();
					c1.setCustomer_address("chennai");
					c1.setCustomer_firstname("john");
					c1.setCustomer_middlename("michel");
					c1.setCustomer_lastname("kennady");
					c1.setPhone_no("2323232");
					c1.setGender("male");
					session.save(c1);
					
					
					Hotel_details h = new Hotel_details();
					h.setHotel_id(1234);
					h.setHotel_name("Taj Palace");
					h.setHotel_address("cbe");
					h.setRooms(50);
					
					session.save(h);
					session.getTransaction().commit();
					session.close();
					

		
	}
}
