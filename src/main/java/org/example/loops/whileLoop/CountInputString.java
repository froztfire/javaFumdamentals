package org.example.loops.whileLoop;

//Use the keyboard to enter a string and a number N greater than 0. Use a while loop to display the string N times.
// Each value should be on a new line.
// Example input: abc 2
// Example output: abc abc

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountInputString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        System.out.print("Enter String: ");
        String str = reader.readLine();
        System.out.print("Enter Number: ");
        int num = Integer.parseInt(reader.readLine());

        while (i < num){
            System.out.println(str);
            i++;
        }
    }
}
