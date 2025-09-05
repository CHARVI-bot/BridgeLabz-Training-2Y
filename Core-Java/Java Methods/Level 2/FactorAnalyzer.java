import java.util.Scanner;

public class FactorAnalyzer {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a number to analyze its factors: ");
        int number = scanner.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + FactorAnalyzer(factors));
        System.out.println("Product of factors: " + getProduct(factors));
        System.out.println("Sum of squares of factors: " + getSumOfSquares(factors));
    }
    }

    public static int getProduct(int[] arr) {
        int product = 1;
        for (int val : arr) {
            product *= val;
        }
        return product;
    }

    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int val : arr) {
            sum += Math.pow(val, 2);
        }
        return sum;
    }
}