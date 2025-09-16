import java.util.Scanner;

public class CharFrequencyFinder {
    
    public static char[][] getCharFrequencies(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        boolean[] visited = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                uniqueCount++;
            }
        }

        char[][] result = new char[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (visited[ch]) {
                result[index][0] = ch;
                result[index][1] = (char)(freq[ch]); 
                visited[ch] = false; 
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char[][] frequencies = getCharFrequencies(input);

            System.out.println("Character Frequencies:");
            for (char[] pair : frequencies) {
                System.out.println("'" + pair[0] + "' : " + (int)pair[1]);
            }
        }
    }
}