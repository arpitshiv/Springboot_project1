package com.example.SpringProject.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
 
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginPage() {
		
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String WELCOMEPage(@RequestParam String name,@RequestParam String password,ModelMap model) {
		
		model.put("password", password);
		model.put("name", name);
		return "welcome";
	}
	
}
