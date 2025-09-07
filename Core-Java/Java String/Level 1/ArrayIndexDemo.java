import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names) {
        System.out.println("\n--- Generating ArrayIndexOutOfBoundsException ---");
        String name = names[names.length]; 
        System.out.println("Accessed name: " + name);
    }

    public static void handleException(String[] names) {
        System.out.println("\n--- Handling ArrayIndexOutOfBoundsException ---");
        try {
            String name = names[names.length]; 
            System.out.println("Accessed name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of names: ");
            int size = scanner.nextInt();
            scanner.nextLine(); 

            String[] names = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = scanner.nextLine();
            }

            handleException(names);
        }
    }
}