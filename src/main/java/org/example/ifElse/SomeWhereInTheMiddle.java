package org.example.ifElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Use the keyboard to enter three numbers, and then display the middle number.
// In other words, not the largest and not the smallest.
// If all the numbers are equal, display any one of them.
public class SomeWhereInTheMiddle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 >= num2 && num1 <= num3 ||
            num1 <= num2 && num1 >= num3){
            System.out.println(num1);
        }else if (num2 >= num1 && num2 <= num3 ||
                  num2 <= num1 && num2 >= num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
