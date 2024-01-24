package com.coderscampus.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {

		UserService userService = new UserService();
		ArrayList<User> userArray = new ArrayList<User>();
		User user = new User();
		
		//user = userService.returnUserInput();
		//System.out.println("Username: " + user.getUsername() + " password: " + user.getPassword());
		//System.out.println("user: " + userName + " Pass: " + password);
		
		userArray = userService.returnUserDataFromFile();
		
//		System.out.println(userArray.get(0));
//		System.out.println(userArray.get(1));
		
//		for (User us: userArray) {
//			System.out.println(us.getUsername() + us.getPassword() + us.getName());
//		}
		
		//user = userArray.get(4);
		//System.out.println(user.getUsername() + user.getPassword() + user.getName());
		//System.out.println(userService.returnUserDataFromFile());
		
	}

}
