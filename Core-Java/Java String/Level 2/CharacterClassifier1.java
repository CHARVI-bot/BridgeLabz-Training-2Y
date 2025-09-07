import java.util.Scanner;

public class CharacterClassifier1 {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i); 

                    if (Character.isDigit(ch)) {
                        System.out.println(ch + " is a digit");
                    } else if (Character.isLetter(ch)) {
                        System.out.println(ch + " is a letter");
                    } else {
                        System.out.println(ch + " is a special character");
                    }
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

    public static String[][] analyzeCharacters(String str) {
        int len = getLength(str);
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = classifyChar(ch);
        }

        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.printf("%-10s\t%s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            String[][] analysis = analyzeCharacters(input);
            displayTable(analysis);
        }
    }
}