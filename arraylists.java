import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylists {
    public static void main(String[] args) {
        // the main difference between array and arraylists is that arraylists can grow in size automatically
        // but arrays can't and array need to be either initialized with data or its size when
        // -declaring it first...arraylists on the other hand do not.

        // example
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Porsche", "Audi", "BMW", "Ferrari", "Toyota" ));
        ArrayList<Integer> oddNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));
        List<Integer> evenNumbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        System.out.println("size of 'cars' arraylist : " + cars.size());
        System.out.println("size of 'oddNumbers' arraylist : " + oddNumbers.size());
        System.out.println("size of 'evenNumbers' arraylist : " + evenNumbers.size());

        System.out.println(cars);
        System.out.println(oddNumbers);
        System.out.println(evenNumbers);

        System.out.println("item at index 2 in cars arraylist : " + cars.get(2));
        cars.add("Mercedes");
        cars.add("Honda");
        // adding a new item to a specific index in the arraylist
        cars.add(2, "Lamborghini");
        System.out.println(cars);

        // removing an item from the arraylist
        cars.remove(3);
        cars.remove("Audi");
        cars.remove("Ferrari");
        cars.remove("Honda");
        System.out.println(cars);
    }
}
