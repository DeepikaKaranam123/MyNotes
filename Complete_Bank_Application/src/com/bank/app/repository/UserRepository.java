package com.bank.app.repository;

import java.util.HashSet;
import java.util.Set;

import com.bank.app.entity.User;

public class UserRepository {
	private static Set<User> users=new HashSet<>();
	static
	{
		User user1=new User("admin","admin","12345","admin",0.0);
		User user2=new User("user2","user2","123456","user",1000.0);
		User user3=new User("user3","user3","1234567","user",2000.0);
		users.add(user1);
		users.add(user2);
		users.add(user3);

	}
	public void printUsers()
	{
		System.out.println(users);
	}
}
