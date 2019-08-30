package Main;
import Model.Delivery;
import Model.Match;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Integer.parseInt;

public class CSVReader {
    private final static String DELIVERY_FILE_PATH = "CSV/deliveries.csv";
    private static final String MATCHES_FILE_PATH = "CSV/matches.csv";

    private static final int DELIVERY_MATCH_ID = 0;
    private static final int DELIVERY_INNING = 1;
    private static final int DELIVERY_BATTING_TEAM = 2;
    private static final int DELIVERY_BOWLING_TEAM = 3;
    private static final int DELIVERY_OVER = 4;
    private static final int DELIVERY_BALL = 5;
    private static final int DELIVERY_BATSMAN = 6;
    private static final int DELIVERY_NON_STRIKER = 7;
    private static final int DELIVERY_BOWLER = 8;
    private static final int DELIVERY_IS_SUPER_OVER = 9;
    private static final int DELIVERY_WIDE_RUNS = 10;
    private static final int DELIVERY_BYE_RUNS = 11;
    private static final int DELIVERY_LEG_BYE_RUNS = 12;
    private static final int DELIVERY_NO_BALL_RUNS = 13;
    private static final int DELIVERY_PENALTY_RUNS = 14;
    private static final int DELIVERY_BATSMAN_RUNS = 15;
    private static final int DELIVERY_EXTRA_RUNS = 16;
    private static final int DELIVERY_TOTAL_RUNS = 17;
    private static final int DELIVERY_PLAYER_DISMISSED = 18;
    private static final int DELIVERY_DISMISSAL_KIND = 19;
    private static final int DELIVERY_FIELDER = 20;

    private static final int MATCH_MATCH_ID = 0;
    private static final int MATCH_SEASON = 1;
    private static final int MATCH_CITY = 2;
    private static final int MATCH_DATE = 3;
    private static final int MATCH_TEAM_ONE = 4;
    private static final int MATCH_TEAM_TWO = 5;
    private static final int MATCH_TOSS_WINNER = 6;
    private static final int MATCH_TOSS_DECISION = 7;
    private static final int MATCH_RESULT = 8;
    private static final int MATCH_DL_APPLIED = 9;
    private static final int MATCH_WINNER = 10;
    private static final int MATCH_WIN_BY_RUNS = 11;
    private static final int MATCH_WIN_BY_WICKETS = 12;
    private static final int MATCH_PLAYER_OF_MATCH = 13;
    private static final int MATCH_VENUE = 14;
    private static final int MATCH_UMPIRE_ONE = 15;
    private static final int MATCH_UMPIRE_TWO = 16;
    private static final int MATCH_UMPIRE_THREE = 17;

    public static ArrayList<Delivery> getDeliveryList() {
        ArrayList<Delivery> deliveryList = new ArrayList<>();
        try (com.opencsv.CSVReader reader = new com.opencsv.CSVReader(new FileReader(DELIVERY_FILE_PATH))) {
            reader.readNext();
            String[] entry;
            while ((entry = reader.readNext()) != null) {
                Delivery delivery = new Delivery();
                delivery.setMatchId(parseInt(entry[DELIVERY_MATCH_ID]));
                delivery.setInning(parseInt(entry[DELIVERY_INNING]));
                delivery.setBattingTeam(entry[DELIVERY_BATTING_TEAM]);
                delivery.setBowlingTeam(entry[DELIVERY_BOWLING_TEAM]);
                delivery.setOver(parseInt(entry[DELIVERY_OVER]));
                delivery.setBall(parseInt(entry[DELIVERY_BALL]));
                delivery.setBatsman(entry[DELIVERY_BATSMAN]);
                delivery.setNonStriker(entry[DELIVERY_NON_STRIKER]);
                delivery.setBowler(entry[DELIVERY_BOWLER]);
                delivery.setIsSuperOver(entry[DELIVERY_IS_SUPER_OVER]);
                delivery.setWideRuns(parseInt(entry[DELIVERY_WIDE_RUNS]));
                delivery.setByeRuns(parseInt(entry[DELIVERY_BYE_RUNS]));
                delivery.setLegByeRuns(parseInt(entry[DELIVERY_LEG_BYE_RUNS]));
                delivery.setNoBallRuns(parseInt(entry[DELIVERY_NO_BALL_RUNS]));
                delivery.setPenaltyRuns(parseInt(entry[DELIVERY_PENALTY_RUNS]));
                delivery.setBatsmanRuns(parseInt(entry[DELIVERY_BATSMAN_RUNS]));
                delivery.setExtraRuns(parseInt(entry[DELIVERY_EXTRA_RUNS]));
                delivery.setTotalRuns(parseInt(entry[DELIVERY_TOTAL_RUNS]));
                delivery.setPlayerDismissed(entry[DELIVERY_PLAYER_DISMISSED]);
                delivery.setDismissalKind(entry[DELIVERY_DISMISSAL_KIND]);
                delivery.setFielder(entry[DELIVERY_FIELDER]);
                deliveryList.add(delivery);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return deliveryList;
    }

    public static List<Match> getMatchesList() {
        ArrayList<Match> matchList = new ArrayList<>();
        try (com.opencsv.CSVReader reader = new com.opencsv.CSVReader(new FileReader(MATCHES_FILE_PATH))) {
            reader.readNext();
            String[] entry;
            while ((entry = reader.readNext()) != null) {
                Match match = new Match();
                match.setId(parseInt(entry[MATCH_MATCH_ID]));
                match.setSeason(parseInt(entry[MATCH_SEASON]));
                match.setCity(entry[MATCH_CITY]);
                match.setDate(entry[MATCH_DATE]);
                match.setTeamOne(entry[MATCH_TEAM_ONE]);
                match.setTeamTwo(entry[MATCH_TEAM_TWO]);
                match.setTossWinner(entry[MATCH_TOSS_WINNER]);
                match.setTossDecision(entry[MATCH_TOSS_DECISION]);
                match.setResult(entry[MATCH_RESULT]);
                match.setDlApplied(parseInt(entry[MATCH_DL_APPLIED]));
                match.setWinner(entry[MATCH_WINNER]);
                match.setWinByRuns(parseInt(entry[MATCH_WIN_BY_RUNS]));
                match.setWinByWickets(parseInt(entry[MATCH_WIN_BY_WICKETS]));
                match.setPlayerOfMatch(entry[MATCH_PLAYER_OF_MATCH]);
                match.setVenue(entry[MATCH_VENUE]);
                match.setUmpireOne(entry[MATCH_UMPIRE_ONE]);
                match.setUmpireTwo(entry[MATCH_UMPIRE_TWO]);
                match.setUmpireThree(entry[MATCH_UMPIRE_THREE]);
                matchList.add(match);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return matchList;
    }
}


