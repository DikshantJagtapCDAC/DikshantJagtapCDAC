package org.fi.springs.FirstSpringApp;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	try( ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-cart.xml"); )
    	{
    		Cart objCart = (Cart)context.getBean("objCart");
    		
    		objCart.addToCart();
    		
    		objCart.listCart();
    		
    		System.out.println();
    		
    	}catch(BeansException Be) {
    		Be.printStackTrace();
    	}
    }
}
