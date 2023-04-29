import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for loops
        // used in situations where we know the eaxct number of times the code should
        // iterate
        for (int i = 1; i <= 5; i++) {
            System.out.println("for-loop iteration number " + i);
            System.out.println("----------------------------");
        }

        System.out.println();

        // while loops
        // can be used in times where number of iterations is know but its more
        // frequently used-
        // -when the number of iterations is not know and we need to iterate until a
        // certain condition is met.
        // The condition is checked before each iteration.
        // This example is when number of iterations are known.
        // Therefore loop will iterate exactly 5 times.
        int j = 1;
        while (j <= 5) {
            System.out.println("while loop iteration number " + j);
            System.out.println("++++++++++++++++++++++++++++++");
            j++;
        }

        System.out.println();

        // This example is where the loop will iterate an unknown amount of times until
        // a certain condition is met.
        // in this example the condition that will stop the loop from iterating is
        // -that if the input of the status is "OFF", the looping will be terminated
        String status = "ON";
        Scanner sc = new Scanner(System.in);
        while (status.equals("ON")) {
            System.out.print("Enter status (ON/OFF) : ");
            status = sc.next().toUpperCase();
            System.out.println(status);
        }

        System.out.println();

        // do...while loops
        // condition is checked after an iteration, therefore this loop stucture will
        // iterate atleast one time before terminating

        int count = 1;
        String input = "continue";
        do {
            System.out.println("iteration number : " + count);
            count++;
            System.out.print("enter input (quit / continue): ");
            input = sc.next().toLowerCase();
            if (!input.equals("continue")) {
                System.out.println("invalid input, enter input form valid inputs ");
            }
        } while (!input.equals("quit"));

        sc.close();
    }
}
