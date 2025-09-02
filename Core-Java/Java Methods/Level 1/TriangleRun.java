import java.util.Scanner;

public class TriangleRun {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Sides must be positive numbers.");
        } else {
            double rounds = calculateRounds(side1, side2, side3);
            System.out.printf("The athlete must complete approximately %.2f rounds to run 5 km.%n", rounds);
        }

        scanner.close();
    }
}