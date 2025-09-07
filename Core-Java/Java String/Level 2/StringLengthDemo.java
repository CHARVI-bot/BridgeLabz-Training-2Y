import java.util.Scanner;

public class StringLengthDemo {

public static int getLengthWithoutUsingLength(String str) {
    int count = 0;
    try {
        while (true) {
            char ch = str.charAt(count);
            System.out.println("Character at index " + count + ": " + ch);
            count++;
        }
    }   catch (StringIndexOutOfBoundsException e) {
    }
    return count;
}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("Enter a string: ");
            String str = sc.next();

            int customLength = getLengthWithoutUsingLength(str);
            int builtInLength = str.length();

            System.out.println("Length (custom method): " + customLength);
            System.out.println("Length (built-in method): " + builtInLength);
        }
    }
}