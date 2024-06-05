package exercises.exercise31;

/**
 * Each file
 * * contains 1,000 lines. Each line contains a ranking, a boy’s name, number for the
 * * boy’s name, a girl’s name, and number for the girl’s name
 */
public class Baby {

    private int rank;
    private String name;
    private int totalNumber;

    public Baby() {
    }

    public Baby(int rank, String name, int totalNumber) {
        this.rank = rank;
        this.name = name;
        this.totalNumber = totalNumber;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public int getTotalNumber() {
        return totalNumber;
    }
}