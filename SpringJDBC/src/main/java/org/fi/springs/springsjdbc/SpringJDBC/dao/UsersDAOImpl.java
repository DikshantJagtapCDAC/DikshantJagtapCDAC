package org.fi.springs.springsjdbc.SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UsersDAOImpl implements UsersDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String sqlInserUser ="insert into user_0030 values(?,?,?,?,?)";
	
	String sqlAllUsers ="select * from user_0030";
	
	String sqlChangeEmail = "update user_0030 set Email=? where UserName=?";
	
	String sqlChangePwd = "update user_0030 set password=? where UserName=?";

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

	@Override
	public void changeEmail(String userName, String Email) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlChangeEmail,Email,userName);
		
	}

	@Override
	public void changePassword(String userName, String password) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sqlChangePwd,password,userName);
		
	}

}
