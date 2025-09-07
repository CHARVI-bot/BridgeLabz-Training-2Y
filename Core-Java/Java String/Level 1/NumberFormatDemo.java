import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String input) {
        System.out.println("\n--- Generating NumberFormatException ---");
        int number = Integer.parseInt(input); 
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String input) {
        System.out.println("\n--- Handling NumberFormatException ---");
        try {
            int number = Integer.parseInt(input); 
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string to convert to integer: ");
            String userInput = scanner.nextLine();

            handleException(userInput);
        }
    }
}