import java.io.*;
import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            Set<Character> uniqueChars = extractUniqueCharacters(input);
            System.out.println("Unique characters: " + uniqueChars);

            char[] copiedArray = copyCharArray(input.toCharArray());
            System.out.println("Copied array: " + Arrays.toString(copiedArray));

            readFile("input.txt"); 
        }
    }

    private static Set<Character> extractUniqueCharacters(String input) {
        Set<Character> uniqueSet = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (uniqueSet.add(ch)) {
                System.out.println("Added: " + ch);
            }
        }
        return uniqueSet;
    }

    private static char[] copyCharArray(char[] original) {
        return Arrays.copyOf(original, original.length);
    }

    private static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Contents of " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}