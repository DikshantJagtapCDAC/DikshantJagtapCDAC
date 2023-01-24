package org.fi.restfulapp.secondRestapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")  //optional
public class UsersController 
{
	
	@GetMapping("/authenticate")
	public boolean authenticate(@RequestParam("userName") String userName, @RequestParam("password") String password)
	{
		if(userName.equals("cdac") && password.equals("cdac"))
			return true;
		else
			return false;
	}

}
