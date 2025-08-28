import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input double values for a, b, and c
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Perform operations with correct precedence
        double result1 = a + b * c;       // Multiplication before addition
        double result2 = a * b + c;       // Multiplication before addition
        double result3 = c + a / b;       // Division before addition
        double result4 = a % b + c;       // Modulus before addition

        // Display results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}