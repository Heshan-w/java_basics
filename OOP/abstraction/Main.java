package OOP.abstraction;

public class Main {
    public static void main(String[] args) {
        // abbstraction is used to add an extra layer of security to a class.
        // whene we declare a class as abstract it cannot be instantiated.
        // it will have to be extended by a subclass.
        // by not allowing some classes to be instantitated we can avoid creating vague objects
        // -that would serve not purpose.

        // abstract methods are declared without an implementation. they would definitely have to be
        // -implemeted in a subclass that extends from the superclass.

        Cat cat1 = new Cat("mammal", "land", "Persian", 2);
        Cat cat2 = new Cat("mammal", "land", "British short-hair", 4);

        cat1.description();

        System.out.println();

        System.out.println(cat2.getGroup());
        System.out.println(cat2.getBreed());
    }

}
