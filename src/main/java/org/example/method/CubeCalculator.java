package org.example.method;
// Let's implement a calculator that will compute the powers of numbers.
// To do this, create a cube() method.
// It must take a long integer value as an argument. The method should raise the passed value to the third power
// and return it as the method's result. The numbers you have to work with may be large. Accordingly, the cube() method return a long.
public class CubeCalculator {

    public static void main(String[] args) {
        System.out.println(cube(3));
    }
    public static long cube(long num){
        long result = num;
        for (int i = 0; i < 2; i++) {
            result = result * num;
        }
        return result;
    }
}
