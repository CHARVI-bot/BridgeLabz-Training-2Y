import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number < 1 || number >= 100) {
            System.out.println("❌ Please enter a number between 1 and 99.");
        } else {
            System.out.println("\nMultiples of " + number + " below 100:");

            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }

        scanner.close();
    }
}