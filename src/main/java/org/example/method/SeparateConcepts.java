package org.example.method;

public class SeparateConcepts {

    public static void main(String[] args) {
        printHydrogenInfo();
        printJavaInfo();
    }

    public static void printHydrogenInfo(){
        for (int i = 0; i < 10; i++) {
            System.out.println("All Hydrogen Information!");
        }
    }
    public static void printJavaInfo(){
        for (int i = 0; i < 10; i++) {
            System.out.println("All Java Information!");
        }
    }
}
