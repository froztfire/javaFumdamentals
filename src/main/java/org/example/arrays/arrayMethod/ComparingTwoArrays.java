package org.example.arrays.arrayMethod;

import java.util.Arrays;

public class ComparingTwoArrays {

    public static String[][] str1 = new String[][]{
            {"jerome","Jhaz", "Baby"},
            {"Sancho, Shantal"},
            {"Jeidy"}
    };
    public static String[][] str2 = new String[][]{
            {"jerome","Jhaz", "Baby"},
            {"Sancho, Shantal"},
            {"Jeidy"}
    };

    public static void main(String[] args) {
        if (ComparingTwoArrays.isEqual()){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    public static boolean isEqual(){
        return Arrays.deepEquals(str1, str2);
    }
}
