import java.util.Scanner;

public class FriendAnalyzer {

    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

public static void main(String[] args) {
    String[] names = {"Amar", "Akbar", "Anthony"};
    int[] ages = new int[3];
    double[] heights = new double[3];

    System.out.println("Enter age and height for Amar, Akbar, and Anthony:");

    try (Scanner scanner = new Scanner(System.in)) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "'s age: ");
            ages[i] = scanner.nextInt();
            System.out.print(names[i] + "'s height (in cm): ");
            heights[i] = scanner.nextDouble();
        }
    }

    int youngestIndex = findYoungest(ages);
    int tallestIndex = findTallest(heights);

    System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
    System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
}
}
