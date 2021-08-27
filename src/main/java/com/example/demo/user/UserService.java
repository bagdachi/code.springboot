package com.example.demo.user;

import java.time.LocalDate;
import java.util.List;

public class UserService {
	
	public List<User> getUser() {
		return List.of(new User(1L, "Chirag", "gb@gg.com", 20, LocalDate.of(1995, 11, 20)));
				
	}
	
}
