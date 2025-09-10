import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
            String.format("%.2f", heightCm),
            String.format("%.2f", weight),
            String.format("%.2f", bmi),
            status
        };
    }

    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        double[][] inputData = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:%n", i + 1);
            System.out.print("Weight (kg): ");
            inputData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            inputData[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = processBMI(inputData);
        displayResults(bmiResults);
    }
}