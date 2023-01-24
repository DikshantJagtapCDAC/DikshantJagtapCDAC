package org.fi.restjpa.RestJPA.controllers;


import java.util.List;

import org.fi.restjpa.RestJPA.dto.UsersDTO;
import org.fi.restjpa.RestJPA.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController 
{
	@Autowired
	UsersService usersService;
	
	@PostMapping("newUsers")
	public boolean addNewUser(@RequestBody UsersDTO dto) {
		return usersService.addNewUser(dto);
	}
	
	@GetMapping("allUsers")
	public List<UsersDTO> getAllUsers(){
		return usersService.allUsers();
	}
	
	@GetMapping("/{UserName}")
	public UsersDTO getUsersByUserName(@PathVariable("UserName") String UserName) {
		return usersService.findByUserName(UserName);
	}

}
