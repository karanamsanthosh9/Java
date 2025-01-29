package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student st = new Student();
        st.setId(1);
        st.setMarks(75);
        st.setName("Kisan");

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        session.save(st);

        System.out.println("Done");


    }
}