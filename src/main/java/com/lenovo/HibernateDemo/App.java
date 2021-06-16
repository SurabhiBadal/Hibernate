package com.lenovo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Project Started" );
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Student student=new Student();
        student.setId(107);
        student.setName("Sony");
        student.setCity("Delhi");

        //Creating object of address;
        Address address=new Address();
        address.setStreet("Street one");
        address.setCity("Delhi");
        address.setOpen(true);
        address.setX(16625.65);



        Session session=factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(address);
        session.getTransaction().commit();
        session.close();
        System.out.println("Done");
    }
}
