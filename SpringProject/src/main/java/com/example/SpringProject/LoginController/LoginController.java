package com.example.SpringProject.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
    private AuthenticationService authenticationService;
    @Autowired  // optional with one constructor (from Spring 4.3+)
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginPage() {
		
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String WELCOMEPage(@RequestParam String name,@RequestParam String password,ModelMap model) {
		if(authenticationService.authenticate(name, password)) {
		model.put("password", password);
		model.put("name", name);
		return "welcome";}
		model.put("errorMessage", "Invalid Credentials either user name or password is wrong");
		return "login";
	}
	
}
