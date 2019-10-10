package com.codingdojo.hola.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		System.out.println("Hello from index");
		
		String name = (String) session.getAttribute("name");
		Integer age = (Integer) session.getAttribute("age");
		
		System.out.println("name is " + name + " and age is " + age);
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("cat", "cats...");
	
		return "index.jsp";
	}
	
	// create 
	@RequestMapping(value="/posted", method=RequestMethod.POST)
	public String postTo(@RequestParam("name") String personName, @RequestParam("age") Integer age, HttpSession session) {
		System.out.println("Posting content " + personName + " age is " + age);
		
		session.setAttribute("name", personName);
		session.setAttribute("age", age);
		
		return "redirect:/";
	}
}
