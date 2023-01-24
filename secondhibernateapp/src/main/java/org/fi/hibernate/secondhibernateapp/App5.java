package org.fi.hibernate.secondhibernateapp;

import java.util.Scanner;

import org.fi.hibernate.secondhibernateapp.entity.ProductId;
import org.fi.hibernate.secondhibernateapp.entity.Products;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App5 {

	public static void main(String[] args) {
		
		Configuration hibernateConfiguration = new Configuration();
    	
    	hibernateConfiguration.configure("second.cfg.xml");
    	
    	try(SessionFactory hibernateFactory  = hibernateConfiguration.buildSessionFactory();
    		Session hibernateSession = hibernateFactory.openSession();
    		Scanner scanner  = new Scanner(System.in))
    	{
    		ProductId pid = new ProductId(1,1);
    		
    		Products objProduct = (Products)hibernateSession.load(Products.class, pid);
    		
    		System.out.println(objProduct.getProductName());
    		System.out.println(objProduct.getProductDescription());
    		System.out.println(objProduct.getProductPrice());
    		
    	}catch(HibernateException e) {
    		e.printStackTrace();
    	}


	}

}
