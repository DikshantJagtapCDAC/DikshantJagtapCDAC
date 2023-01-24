package org.fi.hibernate.secondhibernateapp;

import java.util.Scanner;

import javax.persistence.Query;

import org.fi.hibernate.secondhibernateapp.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) {
		Configuration hibernateConfiguration = new Configuration();
    	
    	hibernateConfiguration.configure("second.cfg.xml");
    	
    	try(SessionFactory hibernateFactory  = hibernateConfiguration.buildSessionFactory();
    		Session hibernateSession = hibernateFactory.openSession();
    		Scanner scanner  = new Scanner(System.in))
    	{
    		System.out.println("Enter the UserName to retrive");
    		String userName = scanner.next();
    		
    		Query query = hibernateSession.createQuery("select OBJECT(oUsers) from Users oUsers where oUsers.userName=:uname");
    		query.setParameter("uname", userName);
    		Users objUsers = (Users)query.getSingleResult();
    		
    		System.out.println(objUsers.getUserName());
			System.out.println(objUsers.getPassword());
			System.out.println(objUsers.getName());
			System.out.println(objUsers.getEmail());
			System.out.println(objUsers.getCity());
			System.out.println("*------------------*");
    		
    		
    	}

	}

}
