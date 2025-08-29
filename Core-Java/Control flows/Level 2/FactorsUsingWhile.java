import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input and validate
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
            return;
        }

        // Step 2: Initialize counter
        int counter = 1;

        System.out.println("Factors of " + number + " (excluding itself):");

        // Step 3: Loop using while
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}