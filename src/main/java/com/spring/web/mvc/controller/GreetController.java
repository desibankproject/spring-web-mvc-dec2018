package com.spring.web.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
 * @author Nagendra
 * This is my model also known as controller
 */

@Controller // Here we can use only this annotation
public class GreetController {
	
	
	@GetMapping("/wgreet")
	public String processRequest(HttpServletRequest request){
		String name=request.getParameter("name");
		String message="Hey! Mr. "+name+", "
				+ "Spring MVC welcomes you!!!!!";
		//We are setting message into request scope 
		//so that we can fetch it on JSP
		request.setAttribute("message",message);
		return "welcome"; //welcome.jsp
	}

}
