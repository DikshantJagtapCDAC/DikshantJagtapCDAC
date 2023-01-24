package org.fi.restfulapp.firstRestapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRESTController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to the first spring rest application this is ";
	}

}
