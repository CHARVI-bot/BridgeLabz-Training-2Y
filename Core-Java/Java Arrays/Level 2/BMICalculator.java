import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int count = scanner.nextInt();

        double[] weights = new double[count];
        double[] heights = new double[count];
        double[] bmis = new double[count];
        String[] statuses = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight (in kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 25) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                              (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}