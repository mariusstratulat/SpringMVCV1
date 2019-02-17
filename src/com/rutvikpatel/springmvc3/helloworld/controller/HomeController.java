package com.rutvikpatel.springmvc3.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("title", "Hello World Example");
		return "hello";
	}
	
	@RequestMapping(value = "/hello/{name}/{age}", method = RequestMethod.GET)
	public String hello(Model model,@PathVariable("name") String name, @PathVariable("age") String age) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("title", "Spring 3.0 MVC Hello World Example");
		return "hello";
	}
}