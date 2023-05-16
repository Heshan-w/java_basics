package OOP.objectPassing;

public class contestants {
    // this class creates objects with attributes.
    // it is these objects that will be passed in as parameteres

    private String name;
    private String contestantID;

    public contestants(String name, String contestantID) {
        this.name = name;
        this.contestantID = contestantID;
    }

    public String getName() {
        return this.name;
    }

    public String getContestantID() {
        return this.contestantID;
    }

}
