package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import jakarta.transaction.Transaction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student st = new Student();
        st.setId(1);
        st.setMarks(75);
        st.setName("Kisan");

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.example.Student.class); 
        cfg.configure();


        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        

        Transaction transaction = session.beginTransaction();

        session.save(st);

        transaction.commit();
        System.out.println("Done");


    }
}