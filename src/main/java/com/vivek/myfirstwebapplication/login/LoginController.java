package com.vivek.myfirstwebapplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthService authservice;
	
	 
	public LoginController(AuthService authservice) {
		super();
		this.authservice = authservice;
	}

	@RequestMapping("login")
	public String loginjsp() {

		return "login";
	}
	
	@RequestMapping(value ="login",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {
		
		if(authservice.auth(name, password)) {
		
		model.put("name", name);
		return "welcome";
	
		}
		model.put("errorMessage", "Try again");
		return "login";
	}
}
