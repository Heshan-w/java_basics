package OOP.constructors;

public class humans {
    private String name;
    private String gender;
    private int birthYear;
    private String occupation;
    // as its a boolean and is not initialized with a value it will carry the default value; "false"
    private boolean marraigeStatus;

    // the constructor for the "humans" class.
    public humans(String name, String gender, int birthYear, String occupation) {
        this.name = name;
        this.gender = gender;
        this.birthYear = birthYear;
        this.occupation = occupation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean getMarraigeStatus() {
        return this.marraigeStatus;
    }

    public void setMarraigeStatus(boolean marraigeStatusP) {
        this.marraigeStatus = marraigeStatusP;
    }

    public void description() {
        System.out.println(this.getName() + " born in " + this.getBirthYear() + ", is " + "currently working as a "
                + this.getOccupation());
    }

}
