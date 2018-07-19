package com.hbuas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class OneToOneTest {
    public static void main(String[] args){
        Configuration c=new Configuration().configure();
        SessionFactory sf=c.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();

        /*Address newAdd=new Address();
        newAdd.setCity("襄阳");
        newAdd.setStreet("隆中大道");

        Orders o=new Orders();

        o.setTimes(new Date().toLocaleString());
        o.setStatus(0);
        o.setUserid(1);

        o.setAdd(newAdd);
        newAdd.setO(o);

        session.save(o);*/

        /*Orders  o=new Orders();
        o.setOrderid(1);
        session.delete(o);*/


        Orders order=(Orders)session.get(Orders.class,1);
        System.out.println(order);
        /*System.out.println(order.getOrderitemsByOrderid());*/

        tr.commit();
        session.close();
        sf.close();
    }

}
