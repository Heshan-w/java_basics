import java.awt.*;

public class primitiveAndReferenceDataTypes {
    public static void main(String[] args) {
        // below is for primitive variables
        // values of x and y are stored in 2 diff memory locations
        // hence they're independent of eachother
        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y); // "1" will be printed as primitive variables aren't linked

        // below is for reference variables
        // variables point1 & point2 will refencence the same object containing the data
        // hence the two variables will be dependent of each other
        // meaning the object data can be changed by making a change to either one of
        // the variables
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); // will print x-coordinate as 2
    }
}
