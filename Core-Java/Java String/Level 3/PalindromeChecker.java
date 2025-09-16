import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeByArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseCharArray(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseCharArray(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            System.out.println("\nPalindrome Check Results:");
            System.out.println("Logic 1 (Iterative): " + (isPalindromeIterative(input) ? "Palindrome" : "Not Palindrome"));
            System.out.println("Logic 2 (Recursive): " + (isPalindromeRecursive(input, 0, input.length() - 1) ? "Palindrome" : "Not Palindrome"));
            System.out.println("Logic 3 (Array Comparison): " + (isPalindromeByArray(input) ? "Palindrome" : "Not Palindrome"));
        }
    }
}
