package org.example.dataTypes.anumalOwner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();

        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }
}
