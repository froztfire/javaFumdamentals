package org.example.loops.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Enter a name from the keyboard and use a for loop to display the following 10 times: loves me.
//Example output for the name "Jhaz": Jhaz loves me
public class ChainLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }
    }
}
