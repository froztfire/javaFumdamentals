package org.example.arrays.linear;

// 1. Create an array of 10 strings.
// 2. Enter 8 strings from the keyboard and save them in the array.
// 3. Display the contents of the entire array (10 elements) on the screen in reverse order.
// Each element on a new line.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArrayInReverseOrder {
    public static void main(String[] args) throws IOException {
        String[] strArray = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter String: ");
            strArray[i] = reader.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(strArray[i]);
        }
    }
}
