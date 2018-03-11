package com.niit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public ModelAndView index()
	{
		ModelAndView mt=new ModelAndView("index");
		return mt;
		
	}
@RequestMapping(value="/login")
public ModelAndView loginpage()
{
	ModelAndView mt1=new ModelAndView("login");
	return mt1;
	
}
}
