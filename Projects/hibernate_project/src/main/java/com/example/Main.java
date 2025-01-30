package com.example;

import javax.security.auth.callback.ConfirmationCallback;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import jakarta.transaction.Transaction;

public class Main {


	static void insert_data( Student st)
	{


		/*      
		//To make shorter(less statements)  
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.example.Student.class); 
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		*/

		// SessionFactory sf = new Configuration().addAnnotatedClass(com.example.Student.class).configure().buildSessionFactory();
		SessionFactory sf = new Configuration()
			.addAnnotatedClass(com.example.Student.class)
			.configure()
			.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		// session.save(st); deprecated from hybernate v6 to meet JPA standards
		session.persist(st);

		transaction.commit();
		session.close();
		sf.close(); 
		System.out.println(st);
		System.out.println("Done");


	}

	static void fetch_data()
	{
			//Fetiching data:
			SessionFactory sf = new Configuration()
					.addAnnotatedClass(com.example.Student.class)
					.configure()
					.buildSessionFactory();
			Session session = sf.openSession();
			Student st2 = null;
			st2  = session.get(Student.class, 1);
			System.out.println(st2);
			session.close();
			sf.close();
	}
	static void update_data()
	{
		//  4 |    35 | Kisan4 ....update marks to 45
		Student st_to_be_updated = new Student();
		st_to_be_updated.setId(4);
		st_to_be_updated.setMarks(45);
		st_to_be_updated.setName("Kisan4");

		SessionFactory sf = new Configuration()
		.addAnnotatedClass(com.example.Student.class)
		.configure()
		.buildSessionFactory();

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.merge(st_to_be_updated);

		transaction.commit();
		session.close();
		sf.close();

	}

	static void delete_data()
	{
		Student st = null;

		SessionFactory sf = new Configuration()
		.addAnnotatedClass(com.example.Student.class)
		.configure()
		.buildSessionFactory();

		Session session = sf.openSession();

		st = session.get(Student.class, 3123);
		Transaction transaction = session.beginTransaction();

		System.out.println(st);
		session.remove(st);
		transaction.commit();
		session.close();
		sf.close();
		System.out.println("delete done");
	}



	public static void main(String[] args) {
		System.out.println("Hello world!");

		Student st = new Student();
		st.setId(5);
		st.setMarks(55);
		st.setName("Kisan5");

		//insert_data(st);
		//fetch_data();

	//	update_data();

		delete_data();

	
		System.out.println("Done");

	}
}
