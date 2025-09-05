import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18; 
    }
public static void main(String[] args) {
    int[] studentAges = new int[10];

    System.out.println("Enter the age of 10 students:");

    try (Scanner scanner = new Scanner(System.in)) {
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            studentAges[i] = scanner.nextInt();

            boolean canVote = canStudentVote(studentAges[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }
    }
}
}