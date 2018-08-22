package com.ab.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.ab.entities.MySiteUser;

 

@Controller
public class RegisterController {

	@RequestMapping( value="/adduser"  , method=RequestMethod.POST)
	public  String  registerButton(  MySiteUser  newUser) {
		   System.out.println(" User's  Information "+newUser);
		
		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		   
		SessionFactory sessionFactory  = (SessionFactory) context.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction  tx = session.beginTransaction();
	    session.save(newUser);		
		session.flush();
		tx.commit();
		session.close();
		return  "redirect:successMessage.jsp";
	}//registerButton

	
}//RegisterController
