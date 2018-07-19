package com.hbuas;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        Configuration c=new Configuration().configure();
        SessionFactory sf=c.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();

        /*User user=new User();
        user.setUsername("enen");
        user.setPassword("123");
        user.setAge(10);
        user.setSex("nan");
        user.setBio("kekekekeke");

        session.save(user);
        user.setUsername("hehe");*/
        tr.commit();

        session.close();
        sf.close();
    }
}

