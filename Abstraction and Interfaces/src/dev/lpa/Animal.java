package dev.lpa;

public abstract class Animal {

    protected String type;
    private String Size;
    private double weight;

    public Animal(String type, double weight, String size) {
        this.type = type;
        this.weight = weight;
        Size = size;
    }

    protected Animal() {
    }

    public abstract void Move(String speed);

    public abstract void makeNoise();
}
