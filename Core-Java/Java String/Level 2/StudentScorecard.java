import java.util.Random;

public class StudentScorecard {

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; 

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; 
            scores[i][1] = rand.nextInt(41) + 60; 
            scores[i][2] = rand.nextInt(41) + 60; 
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] assignGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percent = stats[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-12s%-8s%n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-12.2f%-8s%n",
                    i + 1,
                    scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        int[][] scores = generateScores(numberOfStudents);
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrades(stats);

        displayScorecard(scores, stats, grades);
    }
}