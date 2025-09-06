import java.util.Scanner;

public class StringComparator {

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
            System.out.print("Enter first string: ");
            String str1 = scanner.next();

            System.out.print("Enter second string: ");
            String str2 = scanner.next();

            boolean charAtResult = compareByCharAt(str1, str2);
            boolean equalsResult = str1.equals(str2);

            System.out.println("\n--- Comparison Results ---");
            System.out.println("Using charAt(): " + (charAtResult ? "Strings are equal ✅" : "Strings are not equal ❌"));
            System.out.println("Using equals(): " + (equalsResult ? "Strings are equal ✅" : "Strings are not equal ❌"));

            System.out.println("\nDo both methods agree? " + (charAtResult == equalsResult ? "Yes ✅" : "No ❌"));
        }
    }
}