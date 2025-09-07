import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";

        switch (user) {
            case "rock":
                return computer.equals("scissors") ? "user" : "computer";
            case "paper":
                return computer.equals("rock") ? "user" : "computer";
            case "scissors":
                return computer.equals("paper") ? "user" : "computer";
            default:
                return "invalid";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        String[][] stats = {
            {"Player Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", compPercent)},
            {"Draws", String.valueOf(totalGames - userWins - computerWins), "-"}
        };
        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.printf("%-10s%-15s%-15s%-10s%n", "Game", "Player Choice", "Computer Choice", "Winner");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10d%-15s%-15s%-10s%n", i + 1, gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }

        System.out.println("\n📊 Win Statistics:");
        System.out.printf("%-15s%-10s%-15s%n", "Category", "Wins", "Win %");
        System.out.println("----------------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-15s%-10s%-15s%n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); 

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayResults(gameResults, stats);
        scanner.close();
    }
}