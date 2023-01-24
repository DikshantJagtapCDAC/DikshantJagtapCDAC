package org.fi.springs.ThirdSpringApp;


import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //   System.out.println( "Hello World!" );
    	
    	try( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThirdAppConfiguration.class); )
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
