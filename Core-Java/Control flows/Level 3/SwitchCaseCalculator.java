import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of calculations you want to perform: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("\nCalculation #" + i);

            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = scanner.next();

            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator. Please use +, -, *, or /.");
            }
        }
    }
}