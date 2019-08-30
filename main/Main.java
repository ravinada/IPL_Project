package Main;
import Model.Delivery;
import Model.Match;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void getMatchesPlayedPerYear(List<Match> matches) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (Match match : matches) {
            int year = match.getSeason();
            if (resultMap.containsKey(year))
                resultMap.put(year, resultMap.get(year) + 1);
             else
                resultMap.put(year, 1);
        }
        System.out.println("--Number of Match Played Per Year--\n");

        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " :- " + entry.getValue());
        }
        System.out.println();
    }
    public static void getMatchesWonByTeam(List<Match> matches) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (Match match : matches) {
            String  team = match.getWinner();
            if (resultMap.containsKey(team))
                resultMap.put(team, resultMap.get(team) + 1);
             else
                resultMap.put(team, 1);
        }
        System.out.println("--Number of Match won by each team in IPL--\n");

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " :- " + entry.getValue());
        }
        System.out.println();
    }

    public static void getExtraRunPerTeamInAYear(List<Delivery> deliveries, List<Match> matches, int year) {
        ArrayList<Integer> matchList = new ArrayList<>();
        for (Match match : matches) {
            if (match.getSeason() == year) {
                matchList.add(match.getId());
            }
        }

        Map<String, Integer> resultMap = new HashMap<>();
        for (Delivery delivery : deliveries) {
            if (matchList.contains(delivery.getMatchId())) {
                String bowlingTeam = delivery.getBowlingTeam();
                int extra = delivery.getExtraRuns();
                if (resultMap.containsKey(bowlingTeam))
                    resultMap.put(bowlingTeam, (resultMap.get(bowlingTeam) + extra));
                 else
                    resultMap.put(bowlingTeam, extra);
            }
        }
        System.out.println("--Extra runs by each team in year 2016--\n");

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " :- " + entry.getValue());
        }
        System.out.println();
    }

    public static void getEconomicalBowlersInAYear(List<Delivery> deliveries, List<Match> matches, int year) {
        final String RUN_KEY = "run";
        final String BALL_KEY = "ball";
        List<Integer> matchList = new ArrayList<>();
        for (Match match : matches) {
            if (match.getSeason() == year) {
                matchList.add(match.getId());
            }
        }

        Map<String, HashMap<String, Integer>> bowlerMap = new HashMap<>();
        for (Delivery delivery : deliveries) {
            if (matchList.contains(delivery.getMatchId())) {
                String bowler = delivery.getBowler();
                int runsConceded = delivery.getTotalRuns();
                if (!bowlerMap.containsKey(bowler)) {
                    HashMap<String, Integer> ecomap = new HashMap<>();
                    ecomap.put(BALL_KEY, 1);
                    ecomap.put(RUN_KEY, runsConceded);
                    bowlerMap.put(bowler, ecomap);
                } else {
                    HashMap<String, Integer> ecomap = bowlerMap.get(bowler);
                    ecomap.put(BALL_KEY, ecomap.get(BALL_KEY) + 1);
                    ecomap.put(RUN_KEY, ecomap.get(RUN_KEY) + runsConceded);
                }
            }
        }
        Map<String, Double> bowlerEcoMap = new HashMap<>();

        for (Map.Entry<String, HashMap<String, Integer>> results : bowlerMap.entrySet()) {
            double economy = calEconomy(results.getValue().get(BALL_KEY), results.getValue().get(RUN_KEY));
            bowlerEcoMap.put(results.getKey(), economy);
        }
        List<Map.Entry<String, Double>> bowlerEconomyList = new ArrayList<>(bowlerEcoMap.entrySet());
        bowlerEconomyList.sort((a1, a2) -> a1.getValue().compareTo(a2.getValue()));
        System.out.println("--Top Economical Bowlers In a year--\n");

        for (Map.Entry<String, Double> entry : bowlerEconomyList) {
            System.out.println(entry.getKey() + " :- " + entry.getValue());
        }
        System.out.println();
    }

    private static double calEconomy(int balls, int runs) {
        double economy = ((double) runs / balls) * 6.0;
        return economy;
    }

    public static void main(String[] args) throws IOException {
        List<Delivery> deliveries = CSVReader.getDeliveryList();
        List<Match> matches = CSVReader.getMatchesList();
            getMatchesPlayedPerYear(matches);
            getMatchesWonByTeam(matches);
            getExtraRunPerTeamInAYear(deliveries, matches, 2016);
            getEconomicalBowlersInAYear(deliveries, matches, 2015);
    }
}