package org.example.loops.whileLoop;

public class SeeingDollarInTheFuture {
    public static String dollar = "$$$$$$$$$$";

    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            i++;
            System.out.println(dollar);
        }
    }
}
