package OOP.basics;

public class dogs {
    public int birthYear = 2018;
    private String breed = "Golden retreiver";
    public float weight = 25;
    public String gender = "male";
    public boolean fullyVacinated = true;

    public void bark() {
        System.out.println("bark!! bark!!");
    }

    public void rollOver() {
        System.out.println("good boy rolls over");
    }

    // as breed is a private attribute we need setter and getter methods to access and manipulate its data.
    public String getBreed() {
        return breed;
    }

    // the setBreed method takes a string parameter to set a new breed to a dogs class object.
    public void setBreed(String breedP) {
        breed = breedP;
    }

}
