package com.codingdojo.books.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.codingdojo.books.models.User;
import com.codingdojo.books.repositories.UserRepository;

@Service
public class AuthService {
	private UserRepository userRepo;
	
	public AuthService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public User findByEmail(String email) {
		return userRepo.findByEmail(email).orElse(null);
	}
	
	public User register(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		
		user.setPassword(hashed);
		
		return userRepo.save(user);
	}
	
	public boolean authenticate(String email, String password) {
		User user = findByEmail(email);
		
		return user == null ? false : BCrypt.checkpw(password, user.getPassword());
	}
}
