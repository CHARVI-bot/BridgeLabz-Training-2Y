import java.util.Scanner;

public class UppercaseComparison {

    public static String manualToUpperCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a text: ");
            String input = scanner.nextLine();

            String builtInUpper = input.toUpperCase();

            String manualUpper = manualToUpperCase(input);

            boolean isEqual = compareStrings(builtInUpper, manualUpper);

            System.out.println("\n--- Results ---");
            System.out.println("Built-in toUpperCase(): " + builtInUpper);
            System.out.println("Manual Conversion     : " + manualUpper);
            System.out.println("Are both equal?       : " + isEqual);
        }
    }
}