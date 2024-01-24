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
	public ArrayList<User> returnUserDataFromFile() {
		
		BufferedReader fileReader = null;
		String line;
		User user = new User();
		int i = 0;
		//User[] userArray;
		ArrayList<User> userArray = new ArrayList<>();
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			
			
				while ((line = fileReader.readLine()) != null) {
				String[] splittedString = line.split(",");
				user.setUsername(splittedString[0]);
				user.setPassword(splittedString[1]);
				user.setName(splittedString[2]);
					
					//System.out.println("User names: " + user.getUsername() + " Pass: " + user.getPassword());
					
				userArray.add(user);
				//System.out.println(userArray.get(i).getUsername());
				//i++;
				
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
		
		//int j = 0;
		//for (User us: userArray) {
			//User element = userArray.get(j);
			//System.out.println(us.getUsername() + us.getPassword() + us.getName());
			//j++;
		//}
		
		for (int j = 0; j < 5; j++) {
			System.out.println(userArray.get(j).getUsername());
		}
		
		return userArray;
	}
	
	
}
