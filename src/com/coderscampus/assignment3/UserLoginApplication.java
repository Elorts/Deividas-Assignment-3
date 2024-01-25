package com.coderscampus.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {

		UserService userService = new UserService();
		User[] userArray = new User[5];
		User user = new User();
				
		//userArray = userService.returnUserDataFromFile(); //.clone();
		
		userService.userValidation(userService.returnUserDataFromFile(), userService.returnUserInput());
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(userArray[i].getUsername());
//		}
		
		
		
	}

}
