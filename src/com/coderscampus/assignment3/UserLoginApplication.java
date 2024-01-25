package com.coderscampus.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {

		UserService userService = new UserService();
		User[] userArray = new User[5];
		User user = new User();
		int i = 0;
		boolean isFound = false;
		String name = "";
		
		while (i < 5 && isFound == false) {
			
			name = userService.userValidation(userService.returnUserDataFromFile(), userService.returnUserInput());
			if (name.equals("") ) {
				i++;
			} else {
				isFound = true;
			}
		}
	}
}
