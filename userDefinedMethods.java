public class userDefinedMethods {
    public static void main(String[] args) {
        greetings("hesh");
        wordLength("volcano");
        numberAdder(23, 34332);
        System.out.println(upperCase("good day to you"));
        String question = upperCase("how are you doing ? ");
        System.out.println(question);
    }

    // when we declare the method as "private", the method can only be called inside
    // that file it's present in.
    // if it was declared public we can call that method from anyother java file as
    // well.
    // when we declare the method as "void", it means nothing is returned from the
    // function
    // if we want to return something we must specify that return type in place of
    // "void"
    // for instance in the "upperCase" method, we return a string, hence we have
    // "String" in place of "void" .

    public static void numberAdder(long num1, long num2) {
        long total = num1 + num2;
        total = Math.round(total);
        System.out.println("addition of " + num1 + " and " + num2 + " is " + Math.round(total));
    }

    private static void greetings(String name) {
        System.out.println("Hello " + name + ", welcome to java 101");
    }

    private static void wordLength(String word) {
        System.out.println(word.length());
    }

    private static String upperCase(String phrase) {
        return (phrase.toUpperCase());
    }

    // when the "static" declaration is used we can use that method at any instance
    // by simply calling it.
    // however when it is not used, this means that the method can only be called on
    // declared objects from the class.
    // it cannot be called by itself at any instance.

}