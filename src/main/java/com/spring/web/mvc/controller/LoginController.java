package com.spring.web.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@PostMapping("/login")
	public String authUser(HttpServletRequest request){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String message="Hey! Sorry you are not valid user!!!!!!!!!!!!!";
		if("jack".equals(username) && "jill".equals(password) ){
			 message="Hey! Congratulation you are valid user!!!!!!!!!!!!!";
		}
		//We are setting message into request scope 
		//so that we can fetch it on JSP
		request.setAttribute("message",message);
		//why we cannot use extension
		//JSP,Velosity,ThemeLeaf, 
		return "welcome"; //welcome.jsp
	}
}
