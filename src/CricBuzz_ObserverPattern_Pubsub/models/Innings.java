package CricBuzz_ObserverPattern_Pubsub.models;

public class Innings {

    private String currentOver;
    private String currentBall;
    private String currentRunRate;
    private String currentScore;
    private String wickets;

    public String getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(String currentOver) {
        this.currentOver = currentOver;
    }

    public String getCurrentBall() {
        return currentBall;
    }

    public void setCurrentBall(String currentBall) {
        this.currentBall = currentBall;
    }

    public String getCurrentRunRate() {
        return currentRunRate;
    }

    public void setCurrentRunRate(String currentRunRate) {
        this.currentRunRate = currentRunRate;
    }

    public String getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(String currentScore) {
        this.currentScore = currentScore;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }
}
