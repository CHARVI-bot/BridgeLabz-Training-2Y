import java.util.Scanner;

public class NaturalNumberSumComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number (0 or positive integer): ");
        int n = input.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("✅ Both computations match. The result is correct.");
            } else {
                System.out.println("❌ Mismatch in results. Please check the logic.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}