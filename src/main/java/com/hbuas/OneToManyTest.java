package com.hbuas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class OneToManyTest {
    public static void main(String[] args) {
        Configuration c=new Configuration().configure();
        SessionFactory sf=c.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();


        Orders o=new Orders();
        o.setStatus(1);
        o.setTimes(new Date().toLocaleString()); //Calendar.getInstance().toString()


        Collection<Orderitems> items=new HashSet<Orderitems>();
        Orderitems item1=new Orderitems();
        item1.setPrice(998);
        item1.setProductid(23);
        item1.setCount(2);
        item1.setOrdersByOrderid(o);

        Orderitems item2=new Orderitems();
        item2.setPrice(99);
        item2.setProductid(21);
        item2.setCount(6);
        item2.setOrdersByOrderid(o);

        Orderitems item3=new Orderitems();
        item3.setPrice(89);
        item3.setProductid(17);
        item3.setCount(10);
        item3.setOrdersByOrderid(o);

        items.add(item1);
        items.add(item2);
        items.add(item3);


        o.setOrderitemsByOrderid(items);

        session.save(o);

        tr.commit();

        session.close();
        sf.close();
    }
}
