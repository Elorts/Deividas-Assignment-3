package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

    public User[] returnUserDataFromFile() {

		BufferedReader fileReader = null;
		User[] userArray = new User[4];
		String[] splittedString;
		String line;

		// file located on root dir
		try {
			fileReader = new BufferedReader(new FileReader("c:\\data.txt"));

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
}