package org.fi.hibernate.secondhibernateapp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.fi.hibernate.secondhibernateapp.entity.Users;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		
		Configuration hibernateConfiguration = new Configuration();
    	
    	hibernateConfiguration.configure("second.cfg.xml");
    	
    	try(SessionFactory hibernateFactory  = hibernateConfiguration.buildSessionFactory();
    		Session hibernateSession = hibernateFactory.openSession();
    		Scanner scanner  = new Scanner(System.in))
    	{
    		//HQL
    		// select object(oUser) from Users oUser;
    		Query query = hibernateSession.createQuery("from Users");
    		
    		List<Users> listUsers = query.getResultList();
    		
    		for(Users objUsers : listUsers)
    		{
    			System.out.println(objUsers.getUserName());
    			System.out.println(objUsers.getPassword());
    			System.out.println(objUsers.getName());
    			System.out.println(objUsers.getEmail());
    			System.out.println(objUsers.getCity());
    			System.out.println("*------------------*");
    		}
    	}catch(HibernateException e) {
    		e.printStackTrace();
    	}
	}

}
