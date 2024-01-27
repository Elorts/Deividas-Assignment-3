package com.coderscampus.assignment3.temp;

import com.coderscampus.assignment3.FileService;
import com.coderscampus.assignment3.User;

public class UserServiceRoche {
    private User[] userArray;

    public UserServiceRoche() {
        FileService fileService = new FileService();
        userArray = fileService.returnUserDataFromFile();
    }

    public User getUserByUsernameAndPassword(String username, String password) {
        for (User user : userArray) {
            if (username.equalsIgnoreCase(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}