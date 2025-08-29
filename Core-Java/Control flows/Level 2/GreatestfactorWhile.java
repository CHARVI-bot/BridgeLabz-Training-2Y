import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("❌ Please enter an integer greater than 1 to find its greatest factor.");
        } else {
            int GreatestFactor = 1;
            int counter = number - 1;

            while (counter >= 1) {
                if (number % counter == 0) {
                    GreatestFactor = counter;
                    break; 
                }
                counter--;
            }

            System.out.println("✅ The GreatestFactor of " + number + " (excluding itself) is: " + GreatestFactor);
        }

        scanner.close();
    }
}