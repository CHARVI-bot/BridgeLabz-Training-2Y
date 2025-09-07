import java.util.Scanner;

public class StringExceptionDemo {

    public static void generateException(String input) {
        System.out.println("\n--- Generating Exception ---");
        char ch = input.charAt(input.length()); 
        System.out.println("Character at invalid index: " + ch);
    }

    public static void handleException(String input) {
        System.out.println("\n--- Handling Exception ---");
        try {
            char ch = input.charAt(input.length()); 
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Error: Tried to access index " + input.length() + " in a string of length " + input.length());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        handleException(userInput);

        scanner.close();
    }
}