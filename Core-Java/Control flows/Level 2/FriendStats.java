import java.util.Scanner;

public class FriendStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = scanner.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = scanner.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = scanner.nextDouble();

        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("\n👶 The youngest friend is: " + youngest);
        System.out.println("📏 The tallest friend is: " + tallest);

        scanner.close();
    }
}