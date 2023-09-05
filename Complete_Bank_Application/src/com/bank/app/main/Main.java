package com.bank.app.main;

import java.util.Scanner;

import com.bank.app.repository.UserRepository;
import com.bank.app.service.UserService;

public class Main {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
	 UserService userService = new UserService();

		System.out.println("Enter your username");
		String username=scanner.next();
		
		System.out.println("Enter your password");
		String password=scanner.next();
		
		userService.printUsers();
		
	}

}
