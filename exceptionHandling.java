import java.util.InputMismatchException;
import java.util.Scanner;

import org.w3c.dom.events.EventException;

public class exceptionHandling {
    public static void main(String[] args) {
        // start an exception block by the "try" key word.
        // the try-block will contain the "risky code"(code where an error may occur).
        try {
            int myInt = Integer.parseInt("hello");
            System.out.println(myInt);
            // next we have the catch-block. This is where the code execution will end up
            // once an error occurs.
            // within the catch-block there will be contained the lines of code to be
            // executed once an error occurs.
            // the parentheses contain the exception to expect. in this case its
            // "exception", this will take care of any
            // -and all exception(s) rasied.
            // the 'e' after the exeception type is a name given to a variable where the
            // exeption occured will be stored.
            // this means once an exeception is caught, the exception object will be
            // assigned to variable 'e'
        } catch (Exception e) {
            // in this case the exception is handled by printing out a statement
            System.out.println("You ran into an error");
        }

        // ------------------------------------------------------------ \\

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter number 1 : ");
            float num1 = sc.nextFloat();
            System.out.print("enter number 2 : ");
            float num2 = sc.nextFloat();
            float ans = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + ans);
            // multiple exceptions can be handled in one catch block by using the '|' symbol
            // to separate
            // different exception types.
        } catch (InputMismatchException | EventException e) {
            System.out.println("data type entered is incorrect");
            sc.nextLine();
        }

        // ------------------------------------------------------------ \\

        try {
            System.out.print("enter NUMBER 1 : ");
            float num1 = sc.nextFloat();
            System.out.print("enter NUMBER 2 : ");
            float num2 = sc.nextFloat();
            float ans = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + ans);
            // multiple exceptions can be handled in one catch block by using the '|' symbol
            // to separate
            // different exception types.
        } catch (InputMismatchException | EventException e) {
            System.out.println("Wrong data type entered");
            sc.nextLine();
            // the finnaly block is not needed for execption handling to work, however its
            // an option.
            // code in this block will deffinitely execute regardless an has exception
            // occured or not
            // as best-practice we never return data in the finnaly block as it may cause
            // unexpected results.
        } finally {
            System.out.println("\nCODE IN THE FINALY BLOCK GET EXECUTED NO MATTER WHAT\n");
        }

        // ------------------------------------------------------------ \\

        // we can handle exceptions within a loop.
        while (true) {
            try {
                System.out.print("enter an integer : ");
                int myInt = sc.nextInt();
                System.out.println("integer entered is " + myInt);
                break;
            } catch (InputMismatchException e) {
                System.out.println("data type entered is not a integer, please re-enter\n");
                // IMPORTANT.
                // to avoid the loop from executing infinitely without even accepting user
                // input,
                // we must include 'sc.nextLine()'. This clears the prevously entered data and
                // allows
                // new user data to be input and be executed or checked against the given
                // contions.
                sc.nextLine();
            }
        }
        sc.close();
    }
}
