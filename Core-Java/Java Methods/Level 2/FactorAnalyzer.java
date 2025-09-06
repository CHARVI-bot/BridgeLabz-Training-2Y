import java.util.Scanner;

public class FactorAnalyzer {

    public static int[] getFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int getSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long getProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double getSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();

    if (number <= 0) {
        System.out.println("Invalid input. Please enter a positive integer.");
        return;
    }

    int[] factors = getFactors(number);

    System.out.print("Factors of " + number + ": ");
    for (int factor : factors) {
        System.out.print(factor + " ");
    }

    System.out.println("\nSum of factors: " + getSum(factors));
    System.out.println("Product of factors: " + getProduct(factors));
    System.out.println("Sum of squares of factors: " + getSumOfSquares(factors));
        }
    }
}