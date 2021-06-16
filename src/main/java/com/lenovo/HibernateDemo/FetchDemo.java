package com.lenovo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        //get or load example
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        // no need for transaction
        Student student = (Student) session.get(Student.class, 107);
        System.out.println(student);

        Address address=session.get(Address.class,1);
        System.out.println(address);


    }
}
