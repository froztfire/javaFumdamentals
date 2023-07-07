package org.example.dataTypes.famlyRelation;

// In the main method, create a Man object and save a reference to it in the variable man.
// Also, create a Woman object and save a reference to it in the variable woman.
// Hint: Save a reference to the previous created Woman object in man.wife.
//       Save a reference to the previous created Man object in woman.husband.
public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        woman.husband = man;
        man.wife = woman;
    }
}
