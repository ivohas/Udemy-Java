import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        // Reading cmd
        System.out.println("Please enter command");
        String cmd = cmdScannerReader();

        // Exception handling
        try {
            while (true) {
                if (cmd.equals("Stop")) {
                    System.out.println("End");
                    break;
                } else if (cmd.equals("Console")) {
                    consoleReadLine();
                } else if (cmd.equals("Scanner")) {
                    scanner();
                } else {
                    System.out.println("There is no such command!");
                }

                cmd = cmdScannerReader();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        } finally {
            System.out.println("Buy for now!");
        }
    }

    // Read using Scanner
    public static String cmdScannerReader() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void scanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's you name? ");
        String name = scanner.nextLine().trim();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        String greeting = String.format("Hello, %s. You are %d old.", name, age);
        System.out.println(greeting);
    }

    // Read using console readLine
    public static void consoleReadLine() {
        String name = System.console().readLine("What's your name? ").trim();
        int age = Integer.parseInt(System.console().readLine("How old are you? "));

        String greeting = String.format("Hello, %s. You are %d old.", name, age);
        System.out.println(greeting);
    }
}
