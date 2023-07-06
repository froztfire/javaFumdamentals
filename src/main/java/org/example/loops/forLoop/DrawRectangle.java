package org.example.loops.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Use the keyboard to enter two numbers m and n. Using a for loop,
// display an n x m rectangle made of eights.
// Here's an example: m=2, n=4 8888 8888
public class DrawRectangle {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        String eight = "8";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(eight);
            }
            System.out.println();
        }
    }
}
