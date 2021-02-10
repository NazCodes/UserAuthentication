package com.user.UserAuthentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {
	@Autowired
	AuthenticationRepo authRepo;
	
	ModelAndView authLogin = new ModelAndView("authlogin");
	ModelAndView authSuccess = new ModelAndView("authsuccess");
	ModelAndView authFailed = new ModelAndView("authfailed");
	Logger myLogger = LoggerFactory.getLogger(AuthenticationController.class);
	
	@GetMapping(path = "/authlogin")
	public ModelAndView enterLogin(@ModelAttribute AuthenticationEntity authEntity) {
		authEntity.setUserName("John");
		authEntity.setUserPassword("123john");
		authRepo.save(authEntity);
		return authLogin;
	}
	
	@PostMapping(path = "/authsuccess")
	public ModelAndView successLogin(@ModelAttribute AuthenticationEntity authEntity) {
		Iterable<AuthenticationEntity> authData = authRepo.findAll();
		for(AuthenticationEntity myAuth : authData) {
			if(myAuth.getUserName().equals(authEntity.getUserName()) && myAuth.getUserPassword().equals(authEntity.getUserPassword())) {
				return authSuccess;
			}
		}
		return authFailed;
	}
	
}
