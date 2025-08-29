import java.util.Scanner;

public class GreatestFactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("❌ Please enter an integer greater than 1 to find its greatest factor.");
        } else {
            int greatestFactor = 1;

            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; 
                }
            }

            System.out.println("✅ The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }

        scanner.close();
    }
}