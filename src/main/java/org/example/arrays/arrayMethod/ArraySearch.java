package org.example.arrays.arrayMethod;

import java.util.Arrays;

public class ArraySearch {
    public static int[] array = new int[]{6, 1, 3, 9, -9, -4, 0, 7, 100, 999, 18};
    public static int element = -9;

    public static void main(String[] args) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int index = Arrays.binarySearch(copy, element);
        System.out.println(index >= 0);
    }
}
