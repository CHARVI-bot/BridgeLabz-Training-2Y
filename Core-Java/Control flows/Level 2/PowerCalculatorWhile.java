import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        if (number < 1 || power < 0) {
            System.out.println("❌ Please enter a positive base and a non-negative power.");
        } else {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println("✅ " + number + " raised to the power " + power + " is: " + result);
        }

        scanner.close();
    }
}