import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int formulaSum = number * (number + 1) / 2;

            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }

            System.out.println("\nSum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("✅ Both methods give the same result.");
            } else {
                System.out.println("⚠️ The results do not match. Please check the logic.");
            }
        }

        scanner.close();
    }
}