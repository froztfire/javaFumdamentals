package org.example.method;

//Let's write a utility for working with arrays. The main functionality is ready: the printArray() method displays
// all the elements of the array on the console.
// What is left for you is just a trifle: implement the reverseArray() method.
// It should reverse the order of the elements in the array. The method should only work with arrays of integer values (int[])
public class CorrectOrder {

    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        printArray(array);
        reversedArray(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void reversedArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
