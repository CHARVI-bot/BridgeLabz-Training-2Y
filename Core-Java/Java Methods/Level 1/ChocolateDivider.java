import java.util.Scanner;

public class ChocolateDivider {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  
        result[1] = number % divisor;   
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total number of chocolates: ");
            int numberOfChocolates = sc.nextInt();

            System.out.print("Enter number of children: ");
            int numberOfChildren = sc.nextInt();

            if (numberOfChildren <= 0) {
                System.out.println("Error: Number of children must be greater than zero.");
                return;
            }

            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("\nEach child gets: " + result[0] + " chocolate(s)");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}