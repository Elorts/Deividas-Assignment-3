package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
	
	public User returnUserInput() {
		
		Scanner userEntry = new Scanner(System.in);
		User user = new User();
		
		System.out.println("Enter username: ");
		user.setUsername(userEntry.nextLine());
		
		System.out.println("Enter password: ");
		user.setPassword(userEntry.nextLine());
		
		userEntry.close();
		
		return user;
	}
	
	//Returns array of data from file
	public User[] returnUserDataFromFile() {
		
		BufferedReader fileReader = null;
		String line;
		//User user = new User();
		User[] userArray = new User[5];
		String[] splittedString;
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			
			
				for (int i = 0; i < 5; i++) {
					User user = new User();
					line = fileReader.readLine();	
					splittedString = line.split(",");
					
					user.setUsername(splittedString[0]);
					user.setPassword(splittedString[1]);
					user.setName(splittedString[2]);
					
					userArray[i] = user;
					//System.out.println("Array: " + userArray[i].getUsername() );
			}
		}  catch (FileNotFoundException e) {
			System.out.println("Oops, no file!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, some I/O problem - Exception!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				System.out.println("File closed");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		//System.out.println("Array 0 element: " + userArray[1].getUsername());
		return userArray;
	}
	
	public void userValidation(User[] userArray, User userEntry) {
		boolean found = false;
		int i = 0;
		
		while (found == false && i < 5) {
			if (userArray[i].getUsername().equals(userEntry.getUsername())) {
				System.out.println("Found!! : " + userEntry.getUsername());
				found = true;
			} else {
				i++;
			}
				
			
		}
		
		if (found == true) {
			System.out.println("Welcome " + userArray[i].getName());
		} else {
			System.out.println("Invalid login, please try again.");
		}
		
	}
	
	
}
