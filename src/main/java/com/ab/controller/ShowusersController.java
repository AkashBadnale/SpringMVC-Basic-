package com.ab.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.ab.entities.MySiteUser;

@Controller
public class ShowusersController {

	@SuppressWarnings("unchecked")
	@RequestMapping(value="/ok" ,  method = RequestMethod.GET)
	public ModelAndView showUsers() {
		
		 WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		   
			SessionFactory sessionFactory  = (SessionFactory) context.getBean("sessionFactory");
			Session session = sessionFactory.openSession();
			
	        List<MySiteUser> list =  session.createQuery("from MySiteUser").list();
	        System.out.println(list);

			//return back to index.jsp
			ModelAndView model = new ModelAndView("showUsers");
			model.addObject("lists", list);

			return model;

		}

}//ShowusersController
