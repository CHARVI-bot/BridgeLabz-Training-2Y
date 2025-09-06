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

public static String[] getBMIStatus(double[][] data) {
    String[] status = new String[data.length];

    for (int i = 0; i < data.length; i++) {
        double bmi = data[i][2];

        if (bmi < 18.5) {
            status[i] = "Underweight";
        } else if (bmi < 25) {
            status[i] = "Normal weight";
        } else if (bmi < 30) {
            status[i] = "Overweight";
        } else {
            status[i] = "Obese";
        }
    }

    return status;
}

public static void main(String[] args) {
    final int MEMBERS = 10;
    double[][] bmiData = new double[MEMBERS][3];

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter weight (kg) and height (cm) for 10 members:");

        for (int i = 0; i < MEMBERS; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            bmiData[i][0] = scanner.nextDouble();

            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            bmiData[i][1] = scanner.nextDouble();
        }
    }

    calculateBMI(bmiData);

    String[] status = getBMIStatus(bmiData);

    System.out.println("\nBMI Report:");
    System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");

    for (int i = 0; i < MEMBERS; i++) {
        System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                bmiData[i][0], bmiData[i][1], bmiData[i][2], status[i]);
    }
}
}