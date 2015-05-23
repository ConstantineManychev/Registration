package com.ConstantineManychev;

import com.ConstantineManychev.entity.Users;
import com.ConstantineManychev.persistence.HibernateUtil;
import org.hibernate.Session;

public class EnterPoint {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Users user = new Users("Constantine", "12345678","A");

        user.setName("Alexander");
        user.setPassword("87654321");
        user.setRole("U");

        session.save(user);
        session.getTransaction().commit();
    }
}

