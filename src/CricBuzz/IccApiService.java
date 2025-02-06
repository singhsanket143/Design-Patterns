package CricBuzz;

public class IccApiService {

    private int runs;
    private int wickets;
    private int overs;

    public IccApiService(int runs, int wickets, int overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public int getOvers() {
        return overs;
    }

    public void updateScore(int runs, int wickets, int overs) {
        // Will be making an api call to get the data from icc
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }
}
