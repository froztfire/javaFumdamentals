package org.example.method;

class Repetition {

    public static String s = "Hello World!";
    public static void main(String[] args) {
        print3(s);
    }
    public static void print3(String str){
        for (int i = 0; i < 3; i++) {
            System.out.println(str);
        }
    }
}

class Repetition2{
    public static void main(String[] args) {
        print3("Hello");
        print3("World");
    }
    public static void print3(String str){
        System.out.println(str + " " + str + " " + str);
    }
}
