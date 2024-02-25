package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService {

	public User[] returnUserDataFromFile() {

		BufferedReader fileReader = null;
		User[] userArray = new User[4];
		String[] splittedString;
		String line;

		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));

			for (int i = 0; i < 4; i++) {
				User user = new User();
				line = fileReader.readLine();
				splittedString = line.split(",");

				user.setUsername(splittedString[0]);
				user.setPassword(splittedString[1]);
				user.setName(splittedString[2]);

				userArray[i] = user;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Oops, no file!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, some I/O problem - Exception!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return userArray;
	}

	// Returns user input
	public User returnUserInput(Scanner userEntry) {
		
		User user = new User();

		System.out.println("Enter username: ");
		user.setUsername(userEntry.nextLine());

		System.out.println("Enter password: ");
		user.setPassword(userEntry.nextLine());

		return user;
	}
	
	// Validates the data
	public String userValidation(User[] userArray, User userEntry) {
		boolean found = false;
		int i = 0;

		while (found == false && i < 4) {
			if ((userArray[i].getUsername()).toLowerCase().equals(userEntry.getUsername().toLowerCase())) {
				found = true;
			} else {
				i++;
			}
		}

		if (found == true) {
			return userArray[i].getName();
		} else {
			return "";
		}
	}
}
