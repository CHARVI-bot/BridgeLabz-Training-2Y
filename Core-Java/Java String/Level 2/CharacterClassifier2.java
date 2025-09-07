public class CharacterClassifier2 {

    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String original = "   Hello World!   ";
        int[] indices = findTrimIndices(original);

        String manuallyTrimmed = customSubstring(original, indices[0], indices[1]);

        String builtInTrimmed = original.trim();

        boolean isEqual = compareStrings(manuallyTrimmed, builtInTrimmed);

        System.out.println("Original String: [" + original + "]");
        System.out.println("Manually Trimmed: [" + manuallyTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Are both trims equal? " + isEqual);
    }
}