import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (dividend): ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = input.nextInt();

        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                               " of two numbers " + number1 + " and " + number2);
        }
    }
}