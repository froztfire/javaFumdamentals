package org.example.loops.whileLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Let's write a program where we need to enter numbers from the keyboard, and as soon as -1 is entered,
// then we display the sum of all the entered numbers on the screen and exit the program. -1 should be included in the sum.
public class Adding {

    public static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isTrue = true;
        int sum = 0;
        while (isTrue) {
            int num = Integer.parseInt(reader.readLine());
            sum = sum + num;
            if (num == -1) {
                isTrue = false;
            }
        }
        System.out.println(sum);
    }
}
