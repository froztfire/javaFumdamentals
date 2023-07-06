package org.example.arrays.arrayMethod;

import java.util.Arrays;

public class DisplayingTwoDArrays {

    public static String[][] str = new String[][]{
            {"jerome","Jhaz", "Baby"},
            {"Sancho, Shantal"},
            {"Jeidy"}
    };
    public static int[][] ints = new int[][]{
            {1,2,3,4,5},
            {2,3,4,5},
            {4}
    };

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(str));
        System.out.println(Arrays.deepToString(ints));
    }
}
