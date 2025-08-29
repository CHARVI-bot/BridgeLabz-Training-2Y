import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = scanner.nextInt();

        if (number < 1 || power < 0) {
            System.out.println("❌ Please enter a positive base and a non-negative power.");
        } else {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println("✅ " + number + " raised to the power " + power + " is: " + result);
        }

        scanner.close();
    }
}