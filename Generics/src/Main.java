public class Main {
    public static void main(String[] args) {
        // Box for a String
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        System.out.println("String box contains: " + stringBox.getItem());

        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println("Integer box contains: " + intBox.getItem());

        // Box for custom object (e.g., Car)
        Box<Car> carBox = new Box<>();
        carBox.setItem(new Car("Toyota", 2022));
        Car car = carBox.getItem();
        System.out.println("Car box contains: " + car.getBrand() + " " + car.getYear());
    }
}
