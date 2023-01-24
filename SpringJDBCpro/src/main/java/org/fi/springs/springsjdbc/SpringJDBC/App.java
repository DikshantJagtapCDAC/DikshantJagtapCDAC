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
        	
          //  dao.addUser("nancy", "nancy@123", "NANCY", "nancy@gmail.com", "nagpur");
        	
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
        	
        	
        }
    }
}
