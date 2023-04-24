public class stringsBasics {
    public static void main(String[] args) {
        // strings are refference types in java
        String message1 = new String("hello world!!");
        System.out.println(message1);
        // since its used often, there's a shorter way to assign a string to a variable
        // it makes the string variable look primitive yet its still a reference type
        // we can also concatonate strings by using the + sign
        String message2 = "welcome to my world" + "!!!";
        System.out.println(message2);
        // as "String" is a class, we can access its methods uisng the . operator
        System.out.println(message2.toUpperCase());
        System.out.println(message2.indexOf("t"));
        System.out.println(message2.endsWith("!!!"));
        System.out.println(message1.startsWith("world"));
        System.out.println(message1.length());
        // note that strings are immutable meaning the original string isn't affectd
        // when a String method is called, the changes will be made to a new string object 
        // we can see this by printing message2 after calling a method on it as we get the original object data of message2
        System.out.println(message2);
    }
}
