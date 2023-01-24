package org.fi.springs.springsjdbc.configuration;

import javax.sql.DataSource;

import org.fi.springs.springsjdbc.SpringJDBC.dao.UsersDAO;
import org.fi.springs.springsjdbc.SpringJDBC.dao.UsersDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfiguration {
	
	@Autowired
	Environment environment;
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUsername(environment.getProperty("database.username"));
		ds.setPassword(environment.getProperty("database.password"));
		ds.setUrl(environment.getProperty("database.url"));
		
		// ds.setDriverClassName("com.mysql.cj.jdbc.Driver");  // optional
		
		return ds;
	}
	
	@Bean(initMethod = "initUsersDAO",destroyMethod ="destroyUsers")
	public UsersDAO usersDAO()
	{
		return new UsersDAOImpl();
	}

}
