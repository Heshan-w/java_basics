package OOP.objectPassing;

public class Main {
    public static void main(String[] args) {
        // object passing is where we pass a whole object as a parameter to a method of a different class,
        // -where then that method can access the attribues of the object passed in. 
        
        // first we create an instance of those classes which has methods that will take in an object as a parameter.
        Sprint sprint = new Sprint();
        LongJump longJump = new LongJump();


        // next we create instances of the object we hope to pass in as parameters.
        // in this example our object will have a constructor that will take two parameters
        // -to fill out the two attributes each object will have.
        // as in this example the attributes are private they will be accessed through getters.
        contestants contestant1 = new contestants("Max lester", "1256W");
        contestants contestant2 = new contestants("winston Dalton", "3433W");
        contestants contestant3 = new contestants("Tobey Banes", "7834W");



        // finally we call the methods of the other class while passing objects as parameters.
        // if we go to the files that has these classes declared, we can see how its methods use the
        // -object parameters passed clearly.
        // (in this example those files are "Sprint.java" and "LongJump.java")
        sprint.sprintEvent(contestant2);
        longJump.longJumpEvent(contestant1);
        sprint.sprintEvent(contestant3);
        longJump.longJumpEvent(contestant2);

    }

}
