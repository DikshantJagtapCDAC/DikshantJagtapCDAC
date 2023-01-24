package org.fi.hibernate.secondhibernateapp;

import java.util.Scanner;

import org.fi.hibernate.secondhibernateapp.entity.Category;
import org.fi.hibernate.secondhibernateapp.entity.Users;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	       // System.out.println( "Hello World!" );
	    	
	    	Configuration hibernateConfiguration = new Configuration();
	    	
	    	hibernateConfiguration.configure("second.cfg.xml");
	    	
	    	try(SessionFactory hibernateFactory  = hibernateConfiguration.buildSessionFactory();
	    		Session hibernateSession = hibernateFactory.openSession();
	    		Scanner scanner  = new Scanner(System.in))
	    	{
	    		int choice =0;
	    		while(choice!=5)
			       {
					System.out.println("Enter Your Choice 1.newUser || 2.newCategory || 3.userDetail || 4.categoryDetail");
					choice = scanner.nextInt();
					switch(choice){	
					
					case 1:
					{
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
					
					Users objUser= new Users(userName,password,name,email,city);
					
					
					Transaction transaction = hibernateSession.beginTransaction();
					
					hibernateSession.save(objUser);
					
					transaction.commit();
					
				    System.out.println("record saved");
					}
					break;
					
					case 2:
					{
						System.out.println("Enter CategoryId");
						int categoryId = scanner.nextInt();
						
						System.out.println("Enter CategoryName");
						String categoryName = scanner.next();
						
						System.out.println("Enter CategoryDescription");
						String categoryDescription = scanner.next();
					
						System.out.println("Enter CategoryImageURL");
						String categoryImageURL = scanner.next();
						
						Category objCategory= new Category(categoryId,categoryName,categoryDescription,categoryImageURL);
						
						Transaction transaction = hibernateSession.beginTransaction();
						
						hibernateSession.save(objCategory);
						
						transaction.commit();
						
					    System.out.println("record saved");
					}
					break;
					
					case 3:
					{
						System.out.println("Enter the user name");
		    			String userName = scanner.next();
		    			
		    			Users objUser = (Users)hibernateSession.load(Users.class, userName);
		    			System.out.println(objUser);
					}
					break;
					
					case 4:
					{
						System.out.println("Enter CategoryID");
		    			int categoryId = scanner.nextInt();
		    			
		    			Category objCategory = (Category)hibernateSession.load(Category.class, categoryId);
		    			System.out.println(objCategory);
					}
					break;
			       }
	    	}
	    }catch(HibernateException e) {
    		e.printStackTrace();
    			}
	    }
}
