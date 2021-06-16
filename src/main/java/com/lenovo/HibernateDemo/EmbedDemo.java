package com.lenovo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Student student=new Student();
        student.setName("Shreya");
        student.setCity("Kolkata");

        Certificate certificate=new Certificate();
        certificate.setCourse("Android");
        certificate.setDuration("3 Months");
        student.setCertificate(certificate);

        Student student1=new Student();
        student1.setName("King");
        student1.setCity("jaipur");

        Certificate certificate1=new Certificate();
        certificate1.setCourse("hibernate");
        certificate1.setDuration("6 Months");
        student1.setCertificate(certificate1);

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(student);
        session.save(student1);





        session.close();
    }
}
