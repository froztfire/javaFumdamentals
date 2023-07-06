package org.example.arrays.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. Create an array of 15 integers.
// 2. Populate it with values from the keyboard.
// 3. Let the array index represent the house number.
// The array value at a particular index represents the number of people living in the corresponding house.
// Houses with odd numbers are located at one Side of the Street.

public class StreetAndHouses {
    public static void main(String[] args) throws IOException {
        int[] houses = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter NUmber of Resident on lot " + i + " :");
            houses[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                even += houses[i];
            } else {
                odd += houses[i];
            }
        }
        System.out.println("There are " + even + " residents on even block");
        System.out.println("There are " + odd + " residents on even block");
        if (even > odd) {
            System.out.println("Residents in EVEN block is greater than ODD block");
        } else {
            System.out.println("Residents in ODD block is greater than EVEN block");
        }
    }

}
