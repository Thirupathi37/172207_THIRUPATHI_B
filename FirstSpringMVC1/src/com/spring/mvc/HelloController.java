package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


/*public class HelloController extends AbstractController{

@Override protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception { 
  ModelAndView modelandview = new ModelAndView("Hellopage"); 
modelandview.addObject("welcomeMessage","Hi user,welcome to the first spring mvc applicatio");
return modelandview; 
}
}*/
 

  @Controller
  
//@RequestMapping("/greet") 
  public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		
		ModelAndView modelandView=new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage","Hi User,Welcome to the first spring mvc application");
		return modelandView;
	} 
  }
 