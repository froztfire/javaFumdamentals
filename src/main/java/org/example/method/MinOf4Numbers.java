package org.example.method;

// Write a function that computes the minimum of four numbers. The function min(a, b, c, d) should use (call) the function min(a, b)
// Hint: You need to write the body of the two existing min functions.
public class MinOf4Numbers {

    public static int n1 = 9;
    public static int n2 = 5;
    public static int n3 = 11;
    public static int n4 = 0;

    public static void main(String[] args) {

        System.out.println(min(n1, n2, n3, n4));
        System.out.println(min(n1, n2));
    }

    public static int min(int num1, int num2) {
        return (num1 < num2 ? num1 : num2);
    }

    public static int min(int num1, int num2, int num3, int num4) {
        return min(min(num1, num2), min(num3, num4));
    }
}
