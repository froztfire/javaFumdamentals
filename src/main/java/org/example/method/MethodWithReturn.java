package org.example.method;

class CalculateMinOfTwoNum {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        int minimum = min(number1, number2);
        System.out.println(minimum);
    }

    public static int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else
            return num2;
    }
}

class DuplicateStrings {

    public static void main(String[] args) {
        int count = 5;
        String name = "Jerome";
        multiple(name, count);
    }

    public static void multiple(String name, int count) {
        for (int i = 0; i < count; i++){
            System.out.println(name);
        }
    }
}

class GettingMax {
    public static void main(String[] args) {
        int result = max(5, 10);
        System.out.println(result);
    }

    public static int max(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

}
