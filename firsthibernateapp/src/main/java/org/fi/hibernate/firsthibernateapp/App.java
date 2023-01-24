package org.fi.hibernate.firsthibernateapp;

import java.util.Scanner;

import org.fi.hibernate.firsthibernateapp.entity.Users;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!j
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	Configuration hibernateConfiguration = new Configuration();
    	
    	hibernateConfiguration.configure("hibernate.cfg.xml");
    	
    	try(SessionFactory hibernateFactory  = hibernateConfiguration.buildSessionFactory();
    		Session hibernateSession = hibernateFactory.openSession();
    		Scanner scanner  = new Scanner(System.in))
    {
    		storeObject(hibernateSession, scanner);
    	loadObject(hibernateSession,scanner);
    }catch(HibernateException e){
    	e.printStackTrace();
    }
  }
    	private static void loadObject(Session hibernateSession,Scanner scanner) {
    		while(true) {
    			// storeObject(hibernateSession,scanner)
    			System.out.println("Enter the user name");
    			String userName = scanner.next();
    			
    			Users objUser = (Users)hibernateSession.load(Users.class, userName);
    			System.out.println(objUser);
    		}
 
    	}
    	
    	public static void storeObject(Session hibernateSession, Scanner scanner) {
    		
    		System.out.println("Enter userName");
    		String userName = scanner.next();
    		
    		System.out.println("Enter password");
    		String password = scanner.next();

    		System.out.println("Enter name");
    		String name = scanner.next();
    		
    		System.out.println("Enter email");
    		String email = scanner.next();
    		
    		System.out.println("Enter city");
    		String city = scanner.next();
    		
    		
    		Users objUser = new Users(userName, password, name,email,city);
    		
    		Transaction transaction = hibernateSession.beginTransaction();
    		
    		hibernateSession.save(objUser);
    		
    		transaction.commit();
    		
            System.out.println("record saved");
    	
    }
}
