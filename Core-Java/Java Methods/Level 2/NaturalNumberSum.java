import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number (positive integer): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }

            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);

            System.out.println("\n--- Sum of First " + n + " Natural Numbers ---");
            System.out.println("Using Recursion: " + recursiveSum);
            System.out.println("Using Formula (n*(n+1)/2): " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("✅ Both methods give the same result. Computation is correct.");
            } else {
                System.out.println("❌ Mismatch in results. Please check the logic.");
            }
        }
    }

    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}