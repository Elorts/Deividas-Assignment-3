package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {

		Scanner userEntry = new Scanner(System.in);
		UserService userService = new UserService();
		String userValidationResult; 
		boolean isFound = false;
		int i = 0;

		while (i < 5 && isFound == false) {
			userValidationResult = userService.userValidation(userService.returnUserDataFromFile(), userService.returnUserInput(userEntry));
			if (userValidationResult.equals("")) {
				if (i < 4) { 
					System.out.println("Invalid login, please try again.");
				} else {
					System.out.println("Too many failed login attempts, you are now locked out.");
				}
				i++;
			} else {
				System.out.println("Welcome " + userValidationResult);
				isFound = true;
			}
		}
		userEntry.close();
	}
}
