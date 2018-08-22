package com.ab.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LogoutController {
	@RequestMapping( value="/userLogout"  , method=RequestMethod.POST)
	public  String  registerButton( HttpServletRequest  request ) {
		HttpSession httpSession = request.getSession();
        httpSession.invalidate();
		return  "redirect:loginPage.jsp";
	}
}//LogoutController
