import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            if (index == maxDigit) {
                System.out.println("Maximum digit limit reached. Remaining digits ignored.");
                break;
            }

            number /= 10;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int current = digits[i];

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        System.out.println("\n--- Digit Analysis ---");
        System.out.print("Digits stored: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != -1 ? secondLargest : "Not available"));

        scanner.close();
    }
}