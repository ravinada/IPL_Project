package Model;

public class Delivery {
    private Integer matchId;
    private Integer inning;
    private Integer wideRuns;
    private Integer byeRuns;
    private Integer legByeRuns;
    private Integer noBallRuns;
    private Integer penaltyRuns;
    private Integer batsmanRuns;
    private Integer extraRuns;
    private Integer totalRuns;
    private Integer over;
    private Integer ball;
    private String battingTeam;
    private String bowlingTeam;
    private String batsman;
    private String nonStriker;
    private String bowler;
    private String isSuperOver;
    private String playerDismissed;
    private String dismissalKind;
    private String fielder;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getInning() {
        return inning;
    }

    public void setInning(Integer inning) {
        this.inning = inning;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public Integer getOver() {
        return over;
    }

    public void setOver(Integer over) {
        this.over = over;
    }

    public Integer getBall() {
        return ball;
    }

    public void setBall(Integer ball) {
        this.ball = ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public String getIsSuperOver() {
        return isSuperOver;
    }

    public void setIsSuperOver(String isSuperOver) {
        this.isSuperOver = isSuperOver;
    }

    public Integer getWideRuns() {
        return wideRuns;
    }

    public void setWideRuns(Integer wideRuns) {
        this.wideRuns = wideRuns;
    }

    public Integer getByeRuns() {
        return byeRuns;
    }

    public void setByeRuns(Integer byeRuns) {
        this.byeRuns = byeRuns;
    }

    public Integer getLegByeRuns() {
        return legByeRuns;
    }

    public void setLegByeRuns(Integer legByeRuns) {
        this.legByeRuns = legByeRuns;
    }

    public Integer getNoBallRuns() {
        return noBallRuns;
    }

    public void setNoBallRuns(Integer noBallRuns) {
        this.noBallRuns = noBallRuns;
    }

    public Integer getPenaltyRuns() {
        return penaltyRuns;
    }

    public void setPenaltyRuns(Integer penaltyRuns) {
        this.penaltyRuns = penaltyRuns;
    }

    public Integer getBatsmanRuns() {
        return batsmanRuns;
    }

    public void setBatsmanRuns(Integer batsmanRuns) {
        this.batsmanRuns = batsmanRuns;
    }

    public Integer getExtraRuns() {
        return extraRuns;
    }

    public void setExtraRuns(Integer extraRuns) {
        this.extraRuns = extraRuns;
    }

    public Integer getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Integer totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getPlayerDismissed() {
        return playerDismissed;
    }

    public void setPlayerDismissed(String playerDismissed) {
        this.playerDismissed = playerDismissed;
    }

    public String getDismissalKind() {
        return dismissalKind;
    }

    public void setDismissalKind(String dismissalKind) {
        this.dismissalKind = dismissalKind;
    }

    public String getFielder() {
        return fielder;
    }

    public void setFielder(String fielder) {
        this.fielder = fielder;
    }
}