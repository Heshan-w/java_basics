import java.util.Arrays;

public class arrayBasics {
    public static void main(String[] args) {
        // the way to store numbers in an array
        int[] numbers = { 2, 4, 6, 22, 56, 3};
        // we cant type " System.out.println(numbers); " to get array data however then, java will
        // return the address of the object and not the data in the array
        // hence we use the "Arrays" class along with its "to" method to output the array data
        System.out.print("original array : ");
        System.out.println(Arrays.toString(numbers) + "\n");

        // we can access the numbers array by methods to get certain info. eg:
        System.out.print("length of array : ");
        System.out.println(numbers.length + "\n");

        // we can also access a few other methods in the 'Array' class eg:
        Arrays.sort(numbers);
        System.out.print("sorted array : ");
        System.out.println(Arrays.toString(numbers) + "\n");

        System.out.print("value 6 found in array index : ");
        System.out.println(Arrays.binarySearch(numbers, 6) + "\n");

        // to print a 2D array
        int[][] numbers2D = {{ 1, 2, 3}, { 4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2D) + "\n");

        // to print a 3D array
        int[][][] numbers3D = new int[2][3][4];
        // 1st[] is for array, 2nd[] is for row, 3rd[] is for column
        numbers3D[0][0][0] = 11;
        numbers3D[1][0][0] = 1111;
        numbers3D[1][2][3] = 1212;
        System.out.println(Arrays.deepToString(numbers3D));
    }   
}
