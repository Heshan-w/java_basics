package OOP.arrayOfObjects;

public class objectsArray {
    public static void main(String[] args) {
        // in this approach we first initialize an array of the type "stationary".
        // which is a class we declared separately.
        // we do this as array can only store items of one certain type and we intend to store objects 
        // -of the stationary class in it.
        // in this approach we only know the number of items to be stored in the array not the items it self.
        // hence we first declare an array of the needed size.
        stationary[] pencilCase1 = new stationary[4];

        // next we create objects of the stationary class.
        stationary item1 = new stationary("pen");
        stationary item2 = new stationary("pencil");
        stationary item3 = new stationary("eraser");
        stationary item4 = new stationary("ruler");
    
        // next we save those objects into the array.
        pencilCase1[0] = item1;
        pencilCase1[1] = item2;
        pencilCase1[2] = item3;
        pencilCase1[3] = item4;

        // finally we can print the array out as such. we must use a getter method(if attributes are private)
        // -or use a dot operator to call the attribute directly(if the attributes are public).
        // if not just priniting out an index of the array would only print out the location of the array index
        // and not the data item saved in it.
        System.out.println(pencilCase1[0].getName());
        System.out.println(pencilCase1[1].getName());
        System.out.println(pencilCase1[2].getName());
        System.out.println(pencilCase1[3].getName());


        System.out.println("==============================================================");

        // another approach to do this is, by directly assigning objects to the array.

        // first create objects of the stationary class
        stationary thing1 = new stationary("sharpner");
        stationary thing2 = new stationary("stapler");
        stationary thing3 = new stationary("protactor");

        // next assign the ibjects into the array as you are declaring the array.
        stationary[] pencilCase2 = {thing1, thing2, thing3};

        // finally we can print the array out as such.
        System.out.println(pencilCase2[0].getName());
        System.out.println(pencilCase2[1].getName());
        System.out.println(pencilCase2[2].getName());

    }
}
