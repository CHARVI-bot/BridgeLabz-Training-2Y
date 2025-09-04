import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature 
               + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double temperature = sc.nextDouble();

            System.out.print("Enter wind speed in mph: ");
            double windSpeed = sc.nextDouble();

            if (windSpeed < 0 || temperature > 50) {
                System.out.println("Note: Wind chill formula is valid only for temperatures ≤ 50°F and wind speeds ≥ 3 mph.");
            }

            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("Calculated Wind Chill Temperature: %.2f°F%n", windChill);
        }
    }
}