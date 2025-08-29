import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        System.out.println("\n--- Reversed Number Digits ---");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }

        scanner.close();
    }
}