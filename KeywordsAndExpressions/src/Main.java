import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        UnitConverter unitConverter = new UnitConverter();

        System.out.println("Enter command");
        String cmd = scaner.nextLine();

        // Try some control flow statements
        while (true) {
            if (cmd == "break") {
                break;
            } else if (cmd == "to miles") {
                System.out.println(unitConverter.getMilesToKm(scaner.nextDouble()));
            } else if (cmd == "to km") {
                System.out.println(unitConverter.getKmToMiles(scaner.nextDouble()));
            } else if (cmd == "to pounds") {
                System.out.println(unitConverter.getKgToPounds(scaner.nextDouble()));
            }

            cmd = scaner.nextLine();
        }


        System.out.println("End!");
        checkNumber(5);

        // Parsing data types
        String num = "4";
        int number = Integer.parseInt(num);
        double numberD = Double.parseDouble(num);
    }

    // Created test method
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}