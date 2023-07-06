package org.example.method;

// Rename the parameters of the printPersonInfo() method: - firstName to name; - lastName to surname; - favoriteDish to meal; without changing the program's functionality.
// Leave the variable names in the main() method unchanged.

public class FavoriteDish {

    public static void main(String[] args) {
        String firstName = "Jerome";
        String lastName = "Garcia";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Short dossier:");
        System.out.println("Firstname: " + name);
        System.out.println("Lastname: " + surname);
        System.out.println("Favorite Dish: " + meal);
    }

}
