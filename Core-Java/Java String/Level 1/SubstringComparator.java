import java.util.Scanner;

public class SubstringComparator {

    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.next();

            System.out.print("Enter start index: ");
            int start = scanner.nextInt();

            System.out.print("Enter end index: ");
            int end = scanner.nextInt();

            if (start < 0 || end > input.length() || start >= end) {
                System.out.println("Invalid indices. Please ensure 0 ≤ start < end ≤ string length.");
                return;
            }

            String builtInSubstring = input.substring(start, end);
            String manualSubstring = customSubstring(input, start, end);

            boolean areEqual = compareByCharAt(builtInSubstring, manualSubstring);

            System.out.println("\n--- Substring Comparison ---");
            System.out.println("Built-in substring(): " + builtInSubstring);
            System.out.println("Custom charAt() substring: " + manualSubstring);
            System.out.println("Are both substrings equal? " + (areEqual ? "Yes ✅" : "No ❌"));
        }
    }
}