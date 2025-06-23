public class Car {

    private String make;
    private String model;
    private int doors;
    private int horsePower;
    private int weight;

    public Car() {
        System.out.println("Car initialized!");
    }

    public Car(String make, String model)
    {
        this();
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int doors, int horsePower, int weight)
    {
        this(make, model);
        this.doors = doors;
        this.horsePower = horsePower;
        this.weight = weight;
    }


    @Override
    public String toString() {
        String result = String.format("Your car is %s %s, with %d doors, %d hoursePower, that weights %d kg!", this.make, this.model, this.doors, this.horsePower, this.weight);
        return result.trim();
    }
}
