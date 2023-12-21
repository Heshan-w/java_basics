import java.util.ArrayList;
import java.util.Arrays;

public class arraylists {
    public static void main(String[] args) {
        // the main difference between array and arraylists is that arraylists can grow in size automatically
        // but arrays can't and array need to be either initialized with data or its size when
        // -declaring it first...arraylists on the other hand do not.

        // example
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Porsche", "Audi", "BMW", "Ferarri", "Toyota" ));
        ArrayList<Integer> oddNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));

        System.out.println("size of 'cars' arraylist : " + (cars.size()));
        System.out.println("size of 'oddNumbers' arraylist : " + (oddNumbers.size()));
        System.out.println(cars);
        System.out.println(oddNumbers);
        System.out.println("item at index 2 in cars arraylist : " + cars.get(2));
        cars.add("Mercedes");
        cars.add("Honda");
        cars.remove(3);
        cars.remove("Audi");
        System.out.println(cars);
    }
}
