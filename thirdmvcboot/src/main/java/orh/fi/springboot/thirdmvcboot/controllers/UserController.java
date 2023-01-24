package orh.fi.springboot.thirdmvcboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import orh.fi.springboot.thirdmvcboot.pojo.UserInfo;

@Controller
public class UserController {
	
	@RequestMapping("/login")
	public void prepareLogin(Model data) {
		data.addAttribute("objUser", new  UserInfo());
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView authenticate(@ModelAttribute("objUser")UserInfo objUser)
	{
		if(objUser.getUserName().equals("cdac") && objUser.getPassword().equals("cdac"))
			return new ModelAndView("welcome"+"model"+"welcome"+objUser.getUserName()+",to the online shopping");
		else
			return new ModelAndView("failure","model","invalid user");
	}
	

}
