package com.coderscampus.assignment3;

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