package org.fi.springs.springsjdbc.configuration;

import javax.sql.DataSource;

import org.fi.springs.springsjdbc.SpringJDBC.dao.UsersDAO;
import org.fi.springs.springsjdbc.SpringJDBC.dao.UsersDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfiguration {
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUsername("root");
		ds.setPassword("Dikshant@18");
		ds.setUrl("jdbc:mysql://localhost/dbjava");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");  // optional
		
		return ds;
	}
	
	@Bean
	public UsersDAO usersDAO()
	{
		return new UsersDAOImpl();
	}

}
