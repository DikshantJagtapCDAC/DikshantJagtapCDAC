package org.fi.restjpa.RestJPA.services;

import java.util.List;

import org.fi.restjpa.RestJPA.dto.UsersDTO;

public interface UsersService {
	
	public boolean addNewUser(UsersDTO Users);
	public List<UsersDTO> allUsers();
	public UsersDTO findByUserName(String UserName);

}
