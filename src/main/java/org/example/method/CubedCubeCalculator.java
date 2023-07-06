package org.example.method;

public class CubedCubeCalculator {
    public static void main(String[] args) {
        long ninethPower = ninthDegree(5);
        System.out.println(ninethPower);
    }
    public static long cube(long num){
        long result = num;
        for (int i = 0; i < 2; i++) {
            result = result * num;
        }
        return result;
    }

    public static long ninthDegree(long number){
        return cube(cube(number));
    }
}
