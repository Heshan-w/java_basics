import java.text.NumberFormat;

public class arithmeticOperators {
    public static void main(String[] args) {
        // implicit casting
        // byte > short > int > long > float(decimal) > double(decimal)
        double num1 = 2.7;
        int num2 = 3;
        double total1 = num1 + num2;
        // will print out a double
        System.out.println(total1);

        // explicit casting
        // where we explicitly convert the datatype of a variable to another
        double num3 = 1.1;
        int total2 = (int) num3 + 2;
        System.out.println(total2);

        // converting strings to datatypes supporting arithmetic operations
        // this is important coz user input received is almost always strings
        String strNum1 = "34.5";
        String strNum2 = "16";
        float total3 = Float.parseFloat(strNum1) + Integer.parseInt(strNum2);
        System.out.println(total3);

        // USING METHODS IN THE "Math" CLASS
        int result1 = Math.round(12.7F);
        System.out.println(result1);

        int result2 = (int) Math.ceil(2.1F);
        System.out.println(result2);

        int result3 = (int) Math.floor(2.9F);
        System.out.println(result3);

        int result4 = Math.min(23, 45);
        System.out.println(result4);

        // the random method will return a double value between 0 and 1, it's range can
        // be
        // - expanded by multiplying the random value by a number eg:
        // if we want the value as an int we have to explicitly cast the whole number
        int result5 = (int) (Math.random() * 100);
        System.out.println(result5);

        // FORMATTING NUMBERS
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result6 = currency.format(12324540.925);
        System.out.println(result6);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result7 = percentage.format(0.1);
        System.out.println(result7);
    }
}
