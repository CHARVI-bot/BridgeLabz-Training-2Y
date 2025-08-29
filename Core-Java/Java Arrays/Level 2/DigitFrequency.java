import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
            return;
        }

        int temp = number;
        int count = 0;
        int[] digits = new int[20]; 
        while (temp != 0) {
            digits[count] = temp % 10;
            temp /= 10;
            count++;
        }

        int[] frequency = new int[10]; 

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
        }

        scanner.close();
    }
}