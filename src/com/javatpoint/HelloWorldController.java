package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/DisplayGirls")
	public ModelAndView m1(){
		String str=" unnati, komal , rani , Priti , Priyanka ";
		return new ModelAndView("girlss","answer",str);
	}
	@RequestMapping("/DisplayBoys")
	public ModelAndView m2(){
		String str=" Rahul Pawan Pankaj Shatendar Raju  ";
		return new ModelAndView("boyss","answer",str);
	}
	@RequestMapping("/DisplayCountry")
	public ModelAndView m3(){
		String str="India Russia Japan England ";
		return new ModelAndView("countriess","answer",str);
	}
	@RequestMapping("/DisplayRivers")
	public ModelAndView m4(){
		String str=" Ganga Yamuna Sarwasati Godavari  ";
		return new ModelAndView("riverss","answer",str);
	}
	 
}
