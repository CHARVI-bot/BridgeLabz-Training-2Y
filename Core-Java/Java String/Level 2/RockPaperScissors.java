public class RockPaperScissors {

    public static void main(String[] args) {
    }

    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 0.33) return "rock";
        else if (rand < 0.66) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";

        return switch (user) {
            case "rock" -> computer.equals("scissors") ? "user" : "computer";
            case "paper" -> computer.equals("rock") ? "user" : "computer";
            case "scissors" -> computer.equals("paper") ? "user" : "computer";
            default -> "invalid";
        };
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;
        int draws = totalGames - userWins - computerWins;

        return new String[][] {
            {"Player Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", compPercent)},
            {"Draws", String.valueOf(draws), "-"}
        };
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
}