package dev.intefaces;

public class Car implements Vehicle {
    private boolean engineOn = false;
    private int speed = 0;

    @Override
    public void startEngine() {
        engineOn = true;
        speed = 10; // Starting speed
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println("Car engine stopped.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    // Extra method
    public void accelerate() {
        if (engineOn) {
            speed += 10;
            System.out.println("Accelerating. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Can't accelerate. Engine is off.");
        }
    }
}
