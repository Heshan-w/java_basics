package OOP.objectPassing;

public class Sprint {
    // this class has a method that takes in an object as a parameters.
    // it will use the getter methods from the "contestants.java" class to acess the attributes of an
    // -object passed in as a parameter accordingly.

    public void sprintEvent(contestants contestant) {
        System.out.println(contestant.getName() + ", " + "contestant ID - " + contestant.getContestantID()
                + " participates in the 100m sprint event");
    }
}
