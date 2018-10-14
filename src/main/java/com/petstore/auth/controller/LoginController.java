package com.petstore.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    
	@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
	public String logout(){
		return "logout";
	}
	
//	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")	
	@RequestMapping(value = "/api", method = RequestMethod.GET)
	public String resource() {
		return "hello";
	}
}
