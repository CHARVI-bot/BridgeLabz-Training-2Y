import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int result = calculateSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }

        scanner.close();
    }
}