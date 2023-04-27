import java.util.Scanner;

public class readingInput {
    public static void main(String[] args) {
        // call the Scaner class and instantiate it
        Scanner sc = new Scanner(System.in);
        // prompt the user by printing the required statement out
        // note we use "print" instead of "println", this is to ensure the user input and prompt are on the same line
        System.out.print("enter your name : ");
        // declare to the variable a datatype and assign it a user input by using the "scanner" method  
        // "scanner" has several methods, for strings we can use the "next" or "nextline" methods
        // "nextLine" reads all the CLI inputs and "next" reads only one token of the CLI inputs at a time
        String name = sc.nextLine().trim();
        System.out.println("Welcome " + name + ", this is java 101");

        // for integers we can use methods like "nextInt"
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        System.out.println("you're " + age + " years old");

        // for floats we can use the method nextFloat
        System.out.print("what is your GPA : ");
        float GPA = sc.nextFloat();
        System.out.println("your GPA is " + GPA);
        sc.close();
    }
}
