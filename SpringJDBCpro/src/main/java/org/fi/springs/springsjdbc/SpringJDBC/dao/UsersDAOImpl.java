package org.fi.springs.springsjdbc.SpringJDBC.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

public class UsersDAOImpl implements UsersDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Environment environment;
	
	String sqlInserUser; 
	
	String sqlAllUsers;
	
	public void initUsersDAO()
	{
		System.out.println("init method is fired........! ");
		
		sqlAllUsers = environment.getProperty("sql.allUsers");
		
		sqlInserUser =  environment.getProperty("sql.Insertusers");
	 }
	
	
	public void destroyUsers()
	{
		System.out.println("destroy method is fired.....!");
	}
	
	

	@Override
	public void addUser(String UserName, String password, String Name, String Email, String City) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update(sqlInserUser,UserName,password,Name,Email,City);

	}

	@Override
	public List getAllUsers() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList(sqlAllUsers);
	}

	

}
