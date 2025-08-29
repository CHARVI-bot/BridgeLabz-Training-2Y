import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();

        int[] physics = new int[count];
        int[] chemistry = new int[count];
        int[] maths = new int[count];
        double[] percentages = new double[count];
        String[] grades = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Enter Physics marks: ");
            physics[i] = scanner.nextInt();
            if (physics[i] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
                continue;
            }

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = scanner.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
                continue;
            }

            System.out.print("Enter Maths marks: ");
            maths[i] = scanner.nextInt();
            if (maths[i] < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
                continue;
            }

            int totalMarks = physics[i] + chemistry[i] + maths[i];
            percentages[i] = totalMarks / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s%n",
                              (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}