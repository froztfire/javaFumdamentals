package org.example.loops.forLoop;
//Using a loop to display the following phrase one hundred times:
// "I will never work for peanuts. Amigo" Display each value on a new line.
public class DecentPay {
    public static void main(String[] args) {
        String statement = "I will never work for peanuts. Amigo";
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " +statement);
        }
    }
}
