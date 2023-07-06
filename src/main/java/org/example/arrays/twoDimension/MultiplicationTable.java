package org.example.arrays.twoDimension;

public class MultiplicationTable {
    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                MULTIPLICATION_TABLE[i - 1][j -1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i -1][j - 1]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
