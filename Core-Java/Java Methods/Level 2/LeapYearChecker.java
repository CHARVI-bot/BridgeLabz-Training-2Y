import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a year (≥ 1582): ");
            int year = scanner.nextInt();

            if (year < 1582) {
                System.out.println("❌ Invalid year. Leap year check only applies from 1582 onwards (Gregorian calendar).");
                return;
            }

            if (isLeapYear(year)) {
                System.out.println("✅ " + year + " is a Leap Year.");
            } else {
                System.out.println("❌ " + year + " is NOT a Leap Year.");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}