package org.example.arrays.arrayMethod;

// Implement a static main(String[]) method that populates the array variable with the values valueStart and valueEnd.
// If the length of the array is even, then its first half must be filled with valueStart values, and the second half with valueEnd.
// If the length of the array is odd, then fill the large part with valueStart, and the smaller one with valueEnd

import java.util.Arrays;

public class FillingAnArray {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //line 16 means "if array.length is divisible by 2, array.length divided by 2. else array.length divided by 2 plus 1."
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}