package org.example.method;

//Write a function that returns the minimum of two numbers. Hint: You need to write the body of the existing min function.
public class MinOfThreeNumbers {

    public static void main(String[] args) {
        int result = min(7, 2, 9);
        System.out.println(result);
    }

    public static int min(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
