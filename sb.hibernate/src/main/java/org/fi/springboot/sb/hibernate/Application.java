package org.fi.springboot.sb.hibernate;

import java.util.List;

import org.fi.springboot.sb.hibernate.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages= {"org.fi.springboot.sb.hibernate.entity"})
public class Application implements CommandLineRunner
{
	@Autowired
	SessionFactory hibernateFactory;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try(Session hibernateSession = hibernateFactory.openSession())
		{
			
			Category objCategory = new Category(5,"Clocks","show time","clock.jpg");
			
			hibernateSession.beginTransaction();
			
			hibernateSession.save(objCategory);
			
			hibernateSession.getTransaction().commit();
			
			
			Query<Category> query = hibernateSession.createQuery("from Category");
			
			List<Category> list = query.list();
			
			for(Category objCategory1 : list)
			{
				System.out.println(objCategory1.getCategoryName());
				System.out.println(objCategory1.getCategoryDescription());
				System.out.println("*----------------------*");
			}
			
			
		}
		
	}

}
