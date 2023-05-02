public class switchStatements {
    public static void main(String[] args) {
        // switch statements will compare a certain variable with  alist of pre-stored values.
        // accoridgly certain lines of code will be executed.
        // if the variable being compared isn't available in the list of pre-stored values
        // -the lines of code under the "default" statement will be executed.
        // the " break; " at the end of each execution is essential to exit the switch statement,
        // or else all executable code under the other cases will also be exectued once the varaibles being compared match.
        // note that comparisons can be done only between same data-types.

        String animal = "dog";

        switch (animal) {
            case "anaconda":
                System.out.println(animal + " is a reptile");
                break;
            case "babboon":
                System.out.println(animal + " is a mammal");
                break;
            case "cat":
                System.out.println(animal + " is a mammal");
                break;
            case "dog":
                System.out.println(animal + " is a mammal");
                break;
            case "eagle":
                System.out.println(animal + " is a bird");
                break;
            default:
                System.out.println("animal not in list");
        }
    }
}
