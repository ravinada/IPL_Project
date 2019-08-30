package Model;

public class Match {
    private Integer id;
    private Integer season;
    private Integer dlApplied;
    private Integer winByRuns;
    private Integer winByWickets;
    private String playerOfMatch;
    private String venue;
    private String umpireOne;
    private String umpireTwo;
    private String umpireThree;
    private String winner;
    private String city;
    private String date;
    private String teamOne;
    private String teamTwo;
    private String tossWinner;
    private String tossDecision;
    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public String getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }

    public String getTossDecision() {
        return tossDecision;
    }

    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getDlApplied() {
        return dlApplied;
    }

    public void setDlApplied(Integer dlApplied) {
        this.dlApplied = dlApplied;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Integer getWinByRuns() {
        return winByRuns;
    }

    public void setWinByRuns(Integer winByRuns) {
        this.winByRuns = winByRuns;
    }

    public Integer getWinByWickets() {
        return winByWickets;
    }

    public void setWinByWickets(Integer winByWickets) {
        this.winByWickets = winByWickets;
    }

    public String getPlayerOfMatch() {
        return playerOfMatch;
    }

    public void setPlayerOfMatch(String playerOfMatch) {
        this.playerOfMatch = playerOfMatch;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getUmpireOne() {
        return umpireOne;
    }

    public void setUmpireOne(String umpireOne) {
        this.umpireOne = umpireOne;
    }

    public String getUmpireTwo() {
        return umpireTwo;
    }

    public void setUmpireTwo(String umpireTwo) {
        this.umpireTwo = umpireTwo;
    }

    public String getUmpireThree() {
        return umpireThree;
    }

    public void setUmpireThree(String umpireThree) {
        this.umpireThree = umpireThree;
    }
}

