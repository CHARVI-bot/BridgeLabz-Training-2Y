import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
    int[] numbers = new int[5];

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("→ Positive and Even");
                } else {
                    System.out.println("→ Positive and Odd");
                }
            } else {
                System.out.println("→ Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        switch (result) {
            case 1 -> System.out.println("First element is greater than last.");
            case 0 -> System.out.println("First and last elements are equal.");
            case -1 -> System.out.println("First element is less than last.");
            default -> System.out.println("Unexpected comparison result.");
        }
    }
    }
}
