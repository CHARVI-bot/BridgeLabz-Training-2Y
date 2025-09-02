import java.util.Scanner;

public class NumberCheck {

    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Num = sc.nextInt();

        int result = checkNumber(Num);

        System.out.println("Result: " + result);
    }
}