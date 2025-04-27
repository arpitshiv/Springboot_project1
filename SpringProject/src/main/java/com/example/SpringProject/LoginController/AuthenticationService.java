package com.example.SpringProject.LoginController;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
 public boolean authenticate(String userName,String password) {
	 boolean isValidUserName=userName.equalsIgnoreCase("arpit");
	 boolean isValidPassword=password.equalsIgnoreCase("shrivastava");
	 return isValidUserName && isValidPassword;
 }
}
