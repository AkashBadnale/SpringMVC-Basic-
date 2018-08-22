package com.ab.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.ab.entities.MySiteUser;
import com.ab.entities.Usr;




@Controller
public class LoginController {

	@SuppressWarnings("unchecked")
	@RequestMapping( value="/userLogin"  , method=RequestMethod.POST)
	public  String  registerButton(Usr usr ) {
		  System.out.println(usr);
		
		String usrName = usr.getUname();
		String paswd = usr.getPwd();
		Map<String, String> mapOfUnamesAndPwds =  new HashMap<>();
		
		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		
		SessionFactory sessionFactory  = (SessionFactory) context.getBean("sessionFactory");
		Session hbSession = sessionFactory.openSession();
		Transaction  tx = hbSession.beginTransaction();
	    
		List<MySiteUser>  listOfUnameAndPwd =  hbSession.createQuery("from MySiteUser").list();
	    hbSession.flush();
		tx.commit();
		hbSession.close();
		
	    for (MySiteUser  list : listOfUnameAndPwd) {
		    mapOfUnamesAndPwds.put(list.getUsername(), list.getPassword());
		}//for
	    
	    if(mapOfUnamesAndPwds.containsKey(usrName)) {
	    	if (mapOfUnamesAndPwds.get(usrName).equals(paswd)) {
	    		return  "redirect:welcome.jsp";
			}else {
				System.out.println("password  not correct . Try  Again .");
				return "redirect:loginPage.jsp";
			}
	    }else {
	    	System.out.println("username not found .  Please  enter  valid username .");
	    	return "redirect:loginPage.jsp";
	    }
	    
	}//registerButton
}//LoginController
