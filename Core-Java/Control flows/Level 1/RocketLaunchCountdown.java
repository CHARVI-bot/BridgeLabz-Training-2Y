import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            counter--;
        }

        System.out.println("🚀 Blast off!");
    }
}