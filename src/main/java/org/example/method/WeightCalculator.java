package org.example.method;

// Programmers often move from place to place, but only if they want to. That's why they love converters so much. Well, maybe that's not why.
// Still, we will practice writing them. Now imagine that you have to work at a particular location: the Moon.
// Let's implement a method that converts your Earth weight to your lunar weight.
public class WeightCalculator {

    public static int weight = 888;

    public static void main(String[] args) {
        System.out.println(getWeight(weight));
    }

    public static double getWeight(int weight) {
        double result = (weight) * 0.17;
        return result;
    }
}
