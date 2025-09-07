import java.util.Scanner;

public class WordSplitter {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                char ch = str.charAt(count);
                if (ch == ' ') {
                }
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] manualSplit(String str) {
        int length = getLength(str);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;

        for (int i = 0; i < length; i++) {
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

        words[spaceCount] = str.substring(start, length);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            String[] builtInSplit = input.split(" ");
            String[] manualSplit = manualSplit(input);

            System.out.println("\nWords using built-in split():");
            for (String word : builtInSplit) {
                System.out.println(word);
            }

            System.out.println("\nWords using manual split:");
            for (String word : manualSplit) {
                System.out.println(word);
            }

            boolean isSame = compareArrays(builtInSplit, manualSplit);
            System.out.println("\nAre both arrays equal? " + isSame);
        }
    }
}