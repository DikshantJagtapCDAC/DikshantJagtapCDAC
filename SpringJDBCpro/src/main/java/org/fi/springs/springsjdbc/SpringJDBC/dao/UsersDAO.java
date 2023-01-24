package org.fi.springs.springsjdbc.SpringJDBC.dao;

import java.util.List;

public interface UsersDAO {
	
	public void addUser(String UserName,String password, String Name, String Email,String City);
	
	// Public Void addUser(user objUser)
	
	public List getAllUsers();
	
	
	

}
