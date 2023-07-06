package org.example.arrays.arrayMethod;

//Implement the main(String[]) method, which sorts array in ascending order. Use the Arrays.sort(int[]) method to sort the array.

import java.util.Arrays;

public class SortingAnArray {
    public static int[] array = new int[]{6, 1, 3, 9, -9, -4, 0, 7, 100, 999, 18};

    public static void main(String[] args) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
