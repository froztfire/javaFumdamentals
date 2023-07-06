package org.example.arrays.arrayMethod;

import java.util.Arrays;

public class DisplayingArrays {
    static String[] str = new String[]{"Jerome", "Sancho", "Jhaz", "Shantal", "Jeidy"};
    static int[] ints = new int[]{1,2,3,4,5,6,7,8,};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(ints));
    }
}
