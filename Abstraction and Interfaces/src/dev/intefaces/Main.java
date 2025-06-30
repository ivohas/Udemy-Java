package dev.intefaces;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();

        myCar.startEngine();  // Starts the engine
        System.out.println("Speed: " + myCar.getSpeed());

        // Cast to Car to access accelerate()
        if (myCar instanceof Car) {
            ((Car) myCar).accelerate();
            ((Car) myCar).accelerate();
        }

        myCar.stopEngine();
    }
}
