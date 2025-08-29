import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Enter years of service: ");
            double service = scanner.nextDouble();

            if (salary <= 0 || service < 0) {
                System.out.println("Invalid input. Salary must be > 0 and service >= 0. Please re-enter.");
                i--; 
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = service;
        }

        for (int i = 0; i < 10; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Employee Salary and Bonus Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\n--- Company Totals ---");
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        scanner.close();
    }
}