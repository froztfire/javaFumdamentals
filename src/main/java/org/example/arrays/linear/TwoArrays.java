package org.example.arrays.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1. Create an array of 10 strings.
// 2. Create an array of 10 numbers.
// 3. Enter 10 strings from the keyboard, and put them in an array of strings.
// 4. In each element of the number array, record the length of the string whose string array index coincides with the current index of the number array.
// Display the contents of the number array, each value on a new line.
public class TwoArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter String at index " + i + " :");
            str[i] = reader.readLine();
            num[i] = str[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("There are " + num[i] + " character on index " + i);
        }
    }
}
