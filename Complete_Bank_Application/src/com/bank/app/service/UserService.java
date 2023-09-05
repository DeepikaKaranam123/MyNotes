package com.bank.app.service;
import com.bank.app.repository.UserRepository;

public class UserService {
	private UserRepository userRepository = new UserRepository();
	public void printUsers()
	{
		userRepository.printUsers();
	}
}
