import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25.0) {
                status[i] = "Normal weight";
            } else if (bmi < 30.0) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

public static void main(String[] args) {
    double[][] teamData = new double[10][3]; // [weight, height, BMI]

    System.out.println("Enter weight (kg) and height (cm) for 10 team members:");

    try (Scanner scanner = new Scanner(System.in)) {
        for (int i = 0; i < teamData.length; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }
    }

    calculateBMI(teamData);
    String[] bmiStatus = determineBMIStatus(teamData);

    System.out.println("\nBMI Report:");
    System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
    for (int i = 0; i < teamData.length; i++) {
        System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
    }
}
}