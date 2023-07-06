package org.example.arrays.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersInReverseOrder {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number: ");
            ints[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(ints[i]);
        }
    }
}
