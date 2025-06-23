import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pojo();
        getFirstAndLastChar();
        stringManipulation();
        car();
    }

    public static void getFirstAndLastChar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word!");
        String s = sc.nextLine();
        if (s.isEmpty() || s.isBlank()) {
            System.out.println("String is empty");
        } else {
            System.out.printf("First symbol is %c %n", s.charAt(0));
            System.out.printf("Last symbol is %c %n", s.charAt(s.length() - 1));
        }
    }

    public static void stringManipulation() {
        String bulletList = "Print a Bullet List: \n" +
                "\t\u2022 First Point";

        System.out.println(bulletList);


        String textBlock = """
                Print a Bullted List: 
                    \u2022 First Point""";

        System.out.println(textBlock);
    }

    public static void pojo() {
        Car car = new Car("Porshe", "911", 2, 560, 1500);
        System.out.println(car.toString());

        LpaCar lpaCar = new LpaCar("Porshe", "911", 2, 560, 1500);
        System.out.println(lpaCar.toString());
    }

    public static void car() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's build your dream car!");

        Car firstCar = new Car();
        System.out.println(firstCar.toString());
        String make;

        System.out.println("Please enter what make of car you want.");
        String cmd = scanner.nextLine();
        switch (cmd) {
            case "Porshe", "Audi", "BMW" -> make = cmd;
            default -> System.out.println("Not supported!");
        }

        Car secondCar = new Car("Porshe", "911", 2, 560, 1500);

        System.out.println(secondCar.toString());
    }
}