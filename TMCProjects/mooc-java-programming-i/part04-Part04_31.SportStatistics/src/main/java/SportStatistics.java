
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        int win = 0;
        int loss = 0;

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<GameRecord> games = readRecordsFromFile(file);

        for (GameRecord game: games) {
            if (game.getHomeTeam().equalsIgnoreCase(team) || game.getAwayTeam().equalsIgnoreCase(team)) {
                counter++;
                if (game.getHomeTeam().equalsIgnoreCase(team)) {
                    if (game.getHomeTeamScore() > game.getAwayTeamScore()) {
                        win++;
                    } else {
                        loss++;
                    }
                }
                if (game.getAwayTeam().equalsIgnoreCase(team)) {
                    if (game.getAwayTeamScore() > game.getHomeTeamScore()) {
                        win++;
                    } else {
                        loss++;
                    }
                }
            }
        }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);








    }

    public static ArrayList<GameRecord> readRecordsFromFile(String file) {
        ArrayList<GameRecord> games = new ArrayList<>();
        try(Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] pieces = line.split(",");

                String homeTeam = pieces[0];
                String awayTeam = pieces[1];
                int homeTeamScore = Integer.valueOf(pieces[2]);
                int awayTeamScore = Integer.valueOf(pieces[3]);

                games.add(new GameRecord(homeTeam, awayTeam, homeTeamScore, awayTeamScore));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return games;
    }

}
