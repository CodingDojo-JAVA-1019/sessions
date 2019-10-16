package com.codingdojo.books.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.books.models.User;
import com.codingdojo.books.services.AuthService;
import com.codingdojo.books.validations.UserValidator;

@Controller
@RequestMapping("/sessions")
public class AuthController {
	private AuthService auth;
	private UserValidator userValidator;
	
	public AuthController(AuthService auth, UserValidator userValidator) {
		this.auth = auth;
		this.userValidator = userValidator;
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		
		System.out.println("registering user");
		
		if (result.hasErrors()) {
			return "index.jsp";
		}
		
		auth.register(user);
		
		session.setAttribute("userId", user.getId());
		
		System.out.println("logged in user " + user.getId());
		
		return "redirect:/authors";
		
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirectAttrs) {
		if (!auth.authenticate(email, password)) {
			redirectAttrs.addAttribute("error", "email/password combo not found");
			
			return "redirect:/";
		}
		
		User user = auth.findByEmail(email);
		
		session.setAttribute("userId", user.getId());
		
		System.out.println("logged in user " + user.getId());
		
		return "redirect:/authors";
	}
	
	@DeleteMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
}
