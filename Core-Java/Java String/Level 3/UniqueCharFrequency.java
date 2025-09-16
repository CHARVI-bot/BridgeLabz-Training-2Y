import java.util.Scanner;

public class UniqueCharFrequency {

    public static char[] uniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique.append(ch);
            }
        }

        char[] uniqueArray = new char[unique.length()];
        for (int i = 0; i < unique.length(); i++) {
            uniqueArray[i] = unique.charAt(i);
        }

        return uniqueArray;
    }

    public static String[][] getFrequencies(String text) {
        int[] freq = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String[][] frequencies = getFrequencies(input);

            System.out.println("Character Frequencies:");
            for (String[] pair : frequencies) {
                System.out.println("'" + pair[0] + "' : " + pair[1]);
            }
        }
    }
}