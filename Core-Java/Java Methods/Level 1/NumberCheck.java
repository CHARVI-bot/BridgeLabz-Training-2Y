import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } // sc is automatically closed here
    }
}
    
