package org.example.arrays.linear;

public class GettingMinMax {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, -6, 0, -1, -10};
        if (numbers.length > 0) {
            int max = numbers[0];
            int min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }else {
            System.out.println("Empty Array!!");
        }
    }
}
