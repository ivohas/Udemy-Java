import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args)
            throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("Hello, Ivailo!");

        // Simple read, write on the console
        String s = r.readLine();
        System.out.println(s);

        // Simple test of the if clause
        boolean checker = true;
        if (checker) {
            System.out.println("We are in the if scope");
        }

        // Simple check of the boolean and console
        System.out.println("Do you fell good today?");
        boolean consoleChecker = scanner.nextBoolean();

        if (consoleChecker) {
            System.out.println("Happy to hear that!");
        } else {
            System.out.println("Sorry to hear that!");
            System.out.println("How can I help?");
        }

        // Simple check of the int and console
        System.out.println("How many hours of sleep you get last night?");
        int hourOfSleep = scanner.nextInt();
        if (hourOfSleep < 6 || hourOfSleep > 10){
            System.out.println("You should fix your sleep!");
        }
        else {
            System.out.println("So the sleep wasn't the problem.");
        }

        // Ternary operator
        String country = "Germany";
        boolean isDomestic = country == "Bulgaria" ? true : false ;
        System.out.println(isDomestic);
    }
}
