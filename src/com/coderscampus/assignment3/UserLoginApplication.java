package com.coderscampus.assignment3;

import com.coderscampus.assignment3.temp.UserServiceRoche;
import java.util.Scanner;

public class UserLoginApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserServiceRoche userService = new UserServiceRoche();

        int LOGIN_LIMIT = 5;
        int loginCounter = 0;
        User loggedInUser = null;

        while (loginCounter < LOGIN_LIMIT) {
            String username = promptUserInput(scanner, "Enter username: ");
            String password = promptUserInput(scanner, "Enter password: ");

            loggedInUser = userService.getUserByUsernameAndPassword(username, password);

            if (loggedInUser != null) {
                System.out.println("Welcome" + loggedInUser.getName());
            } else if (loginCounter < LOGIN_LIMIT - 1) {
                System.out.println("invalid login, please try again.");
            }

            loginCounter++;
        }

        if (loggedInUser == null) {
            System.out.println("Too many failed logins! Logged out!");
        }

        scanner.close();
    }

    private static String promptUserInput(Scanner scanner, String promptMsg) {
        System.out.println(promptMsg);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
