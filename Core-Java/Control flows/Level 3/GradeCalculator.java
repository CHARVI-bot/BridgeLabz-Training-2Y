import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();

        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        System.out.printf("Average Percentage: %.2f%%\n", percentage);

        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Outstanding performance!";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Excellent work!";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good job, keep improving.";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Fair effort, but room to grow.";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Needs improvement.";
        } else {
            grade = "F";
            remarks = "Failed. Better luck next time.";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}