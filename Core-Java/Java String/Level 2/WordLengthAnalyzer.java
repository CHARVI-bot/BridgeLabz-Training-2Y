import java.util.Scanner;

public class WordLengthAnalyzer {

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

    public static String[] manualSplit(String str) {
        int len = getLength(str);
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0;

        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndexes[i];
            words[i] = str.substring(start, end);
            start = end + 1;
        }

        words[spaceCount] = str.substring(start, len);

        return words;
    }

    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }

        return table;
    }

    public static int[] findShortestAndLongest(String[][] wordTable) {
        int minLen = Integer.MAX_VALUE;
        int maxLen = Integer.MIN_VALUE;

        for (String[] row : wordTable) {
            int length = Integer.parseInt(row[1]);
            if (length < minLen) minLen = length;
            if (length > maxLen) maxLen = length;
        }

        return new int[]{minLen, maxLen};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            String[] words = manualSplit(input);
            String[][] wordTable = getWordLengthTable(words);
            int[] extremes = findShortestAndLongest(wordTable);

            System.out.println("\nWord\t\tLength");
            System.out.println("------------------------");
            for (String[] row : wordTable) {
                String word = row[0];
                int length = Integer.parseInt(row[1]);
                System.out.printf("%-15s %d\n", word, length);
            }

            System.out.println("\nShortest word length: " + extremes[0]);
            System.out.println("Longest word length: " + extremes[1]);
        }
    }
}