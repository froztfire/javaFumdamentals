package org.example.method;

public class WelcomeButNotEveryone {
    public static void main(String[] args) {
        String userName = "sancho";
        signIn(userName);
    }

    public static void signIn(String userName){
        if (userName.equals("user")){
            return;
        }
        System.out.println("Welcome, " + userName);
        System.out.println("We've really missed you, " + userName);
    }
}
