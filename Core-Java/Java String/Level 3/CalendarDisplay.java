import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getDaysInMonth(month, year);

        // First loop: print initial spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop: print days of the month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // Move to next line after Saturday
            }
        }
        System.out.println(); // Final line break
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
            } else {
                displayCalendar(month, year);
            }
        }
    }
}
