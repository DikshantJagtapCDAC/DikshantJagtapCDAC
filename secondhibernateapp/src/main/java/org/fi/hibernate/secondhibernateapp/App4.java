package org.fi.hibernate.secondhibernateapp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App4 {

	public static void main(String[] args) {
Configuration hibernateConfiguration = new Configuration();
    	
    	hibernateConfiguration.configure("second.cfg.xml");
    	
    	try(SessionFactory hibernateFactory  = hibernateConfiguration.buildSessionFactory();
    		Session hibernateSession = hibernateFactory.openSession();
    		Scanner scanner  = new Scanner(System.in))
    	{
    		System.out.println("Enter the UserName to retrive");
    		String userName = scanner.next();
    		
    		Query query = hibernateSession.getNamedNativeQuery("sqlAllUsers");
    		
    		List<Object[]> listUsers = query.getResultList();
    		
    		for(Object [] row : listUsers)
    		{
    			System.out.println(row[1]);
    			System.out.println(row[2]);
    			System.out.println(row[3]);
    			System.out.println(row[4]);
    			System.out.println(row[5]);
    			System.out.println("*----------------*");
    		}
    		
    		
    	}catch(HibernateException e) {
    		e.printStackTrace();
    	}

	}

}
