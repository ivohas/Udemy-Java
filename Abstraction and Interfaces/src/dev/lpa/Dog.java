package dev.lpa;

public class Dog extends Animal{
    @Override
    public void Move(String speed) {
        System.out.println("Running at speed: " + speed);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow bow");
    }

    public Dog(String type, double weight, String size) {
        super(type, weight, size);
    }
}
