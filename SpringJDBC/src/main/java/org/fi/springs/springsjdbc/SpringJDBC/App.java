package org.fi.springs.springsjdbc.SpringJDBC;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.fi.springs.springsjdbc.SpringJDBC.dao.UsersDAO;
import org.fi.springs.springsjdbc.configuration.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class))
        {
        	
        	
        	UsersDAO dao = (UsersDAO) context.getBean("usersDAO");
        	
          /*  dao.addUser("dao", "dao@123", "DAO", "dao@gmail.com", "Daaoo");
        	
        	List<Map<String,Object>> allUsers = dao.getAllUsers();
        	
        	for(Map<String,Object> data : allUsers)
        	{
        		System.out.println(data.get("UserName"));
        		System.out.println(data.get("password"));
        		System.out.println(data.get("Name"));
        		System.out.println(data.get("Email"));
        		System.out.println(data.get("City"));
        		System.out.println("*------------------*");
        	}  
        	
           */
        	
        	
        	dao.changePassword();
        	System.out.println("Enter new  password");
        	scanner.next();
        	System.out.println("Enter UserName");
        	scanner.next();
        	
        	System.out.println("User Saved");
        	
        	
        	
        	System.out.println("Enter new Email");
        	String email = scanner.next();
        	System.out.println("Enter UserName");
        	String user = scanner.next();
        	dao.changeEmail(user,email);
        	System.out.println("User Saved");
        }
    }
}
