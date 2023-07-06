package org.example.arrays.arrayMethod;

//Implement the main(String[]) method, which splits an array into two subarrays and fills a two-dimensional result array with them.
//If the length of the array is odd, then the larger half should be copied into the first subarray.
// Use the Arrays.copyOfRange(int[], int, int) method to split the array. Do not change the order of the elements.

import java.util.Arrays;

public class SplittingAnArray {
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static int[][] result = new int[2][];

    public static void main(String[] args) {
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        result[0] = Arrays.copyOfRange(array, 0, firstPart);
        result[1] = Arrays.copyOfRange(array, firstPart, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
