package com.khmer2500.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping(value ="/")
	public String home(){
		System.out.println("Home work");
		return "index";
	}
}
