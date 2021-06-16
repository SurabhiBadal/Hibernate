package com.MappingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingDemoApp {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setEid(51);
        e1.setName("King");
        e2.setEid(52);
        e2.setName("Queen");

        Project p1=new Project();
        Project p2=new Project();
        p1.setPid(1);
        p1.setProjectName("java");
        p2.setPid(2);
        p2.setProjectName("Spring");

        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);

        List<Project> list1=new ArrayList<>();
        list1.add(p1);
        list1.add(p2);

        e1.setProjects(list1);
        p2.setEmployees(list);

        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);


    }
}
