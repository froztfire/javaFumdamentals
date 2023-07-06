package org.example.loops.forLoop;

//Using a for loop, display a right triangle of eights, with a base of 10 and a height of 10.
// Example output:
// 8
// 88
// 888
// 8888
// 88888
// 888888
// 8888888
// 88888888
// 888888888
// 8888888888
public class TriangleOfEights {
    public static String eight = "8";

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(eight);
            }
            System.out.println();
        }
    }
}
