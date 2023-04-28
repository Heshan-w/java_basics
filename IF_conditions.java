public class IF_conditions {
    public static void main(String[] args) {
        // we will be going over nested if statements, else if and else statements.
        // when writing an if statement it is a must to wrap condition in parantheses.
        // the curly braces that come after can be omitted if only one statement is
        // executed after entering the if condition and
        // - that statement isn't a variable declaration statement. Else,
        // - it is best practice to add curly braces if more than one stemement is
        // executed .
        // for clarity of code we can indent all if statements under one line starting
        // position as shown below.
        // finally we will be discussing about the ternary operator

        double height = 129.3;
        if (height >= 130)
            System.out.println("can go on all amusement park rides!!");
        else if (height >= 100) {
            System.out.println("cannot ride roller coasters");
            System.out.println("cannot zipline");
        } else
            System.out.println("can only access kiddies park");

        // as we cannot declare variables inside if code blocks and use that variable
        // outside the code block
        // we can decalre a variable outisde the if statement block first, allowing us
        // to assign and use varibales inside and out of the
        // - if statement block
        double price = 100_000;
        boolean expensive = false;
        if (price > 80_000)
            expensive = true;
        if (expensive == true)
            System.out.println("product is expensive");
        else
            System.out.println("product is not expensive");

        // simpler version of this code would be
        double cost = 20_000;
        boolean EXPENSIVE = (cost > 80_000);
        if (EXPENSIVE)
            System.out.println("product is EXPENSIVE");
        else
            System.out.println("product is not EXPENSIVE");

        // ternary operator allows us to assign to variables in an easy manner, directly
        // below is a code block to classify a weight class
        // we'll assume weight is in kg for this example
        double weight = 105.4;
        String weightClass = "super heavy weight";
        if (weight < 110)
            weightClass = "heavy weight";
        System.out.println("weight class is : " + weightClass);

        // this code can be simplified by using the ternary operator as follows
        double WEIGHT = 120.5;
        String WEIGHTCLASS = (WEIGHT >= 110) ? "SUPER HEAVY WEIGHT" : "HEAVY WEIGHT";
        System.out.println("weight class is : " + WEIGHTCLASS);
        // as shown above the ternary operator gets rid of the need to initialize the
        // string "WEIGHTCLASS" before hand
        // and it gets the same job done with less lines of code...it works as follows
        // first a variable is initialized
        // second a condition is checked...(note syntax, after condition a "?" is
        // placed)
        // finally as condition checked is boolean, give the operation two options
        // 1st option if the condition is true and second if it's false

        // another ternary operator example;
        // the " ? " and " : " make up the ternary operator
        int marks = 49;
        boolean pass = (marks >= 50) ? true : false;
        System.out.println("exam passed : " + pass);
    }
}
