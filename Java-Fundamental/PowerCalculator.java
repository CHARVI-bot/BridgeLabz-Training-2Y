public class PowerCalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt for base
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Prompt for exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power
        double result = Math.pow(base, exponent);

        // Display result
        System.out.printf("%.2f raised to the power of %.2f is %.4f%n", base, exponent, result);

        scanner.close();
    }
}
