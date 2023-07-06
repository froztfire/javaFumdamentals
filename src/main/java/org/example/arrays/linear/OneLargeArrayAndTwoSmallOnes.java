package org.example.arrays.linear;

//1. Create an array of 20 numbers.
// 2. Populate it with values from the keyboard.
// 3. Create two arrays of 10 numbers each.
// 4. Copy the large array into the two small ones: half the numbers into the first small array, and the second half into the second small array.
// 5. Display the second small array, each value on a new line.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneLargeArrayAndTwoSmallOnes {
    public static void main(String[] args) throws IOException {
        int[] largeArr = new int[6];
        int[] smallArr1 = new int[3];
        int[] smallArr2 = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 6; i++) {
            largeArr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 3; i++) {
            smallArr1[i] = largeArr[i];
            smallArr2[i] = largeArr[i + 3];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(smallArr2[i]);
        }
    }
}
