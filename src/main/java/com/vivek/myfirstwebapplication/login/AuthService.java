package com.vivek.myfirstwebapplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
	public boolean auth(String username,String password) {
		boolean isValidUser = username.equalsIgnoreCase("vivek");
		boolean isValidPass = password.equalsIgnoreCase("password");
		
		return isValidUser && isValidPass;
	}

}
