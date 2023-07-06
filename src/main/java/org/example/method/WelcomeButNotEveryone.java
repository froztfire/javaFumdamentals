package org.example.method;

// This is the signIn() method that greets website users. Currently, it greets all users, but it should only greet registered users.
// All unregistered users have the name "user". Add username validation at the beginning of the signIn() method.
// If the name is "user", use the return keyword to abort execution of the method.

public class WelcomeButNotEveryone {
    public static void main(String[] args) {
        String userName = "sancho";
        signIn(userName);
    }

    public static void signIn(String userName) {
        if (userName.equals("user")) {
            return;
        }
        System.out.println("Welcome, " + userName);
        System.out.println("We've really missed you, " + userName);
    }
}
