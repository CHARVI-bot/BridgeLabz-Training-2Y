import java.util.Scanner;

public class VowelConsonantCounter {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                char ch = str.charAt(count);
                if (ch == ' ') {
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String classifyChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        int len = getLength(str);

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            String type = classifyChar(ch);

            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            int[] counts = countVowelsAndConsonants(input);

            System.out.println("\nVowel Count: " + counts[0]);
            System.out.println("Consonant Count: " + counts[1]);
        }
    }
}