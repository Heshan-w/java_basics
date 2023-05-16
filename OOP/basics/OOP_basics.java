package OOP.basics;

public class OOP_basics {
    public static void main(String[] args) {
        // this file has a basic example of OOP.
        // "class" is template for creating objects
        // "object" is an instance of a class that may include attributes and/or methods.
        // "attributes" aka "instance variables" describe the characteristics of an object.
        // "methods" are the functions/actions that can be performed on a object.

        // in this example we will have a separate file for the class from which objects will be created.
        // if it was included in this same file, make sure to declare that 
        // -class outisde the class of this file. (which in this example is "OOP_basics")

        // this is how we instantiate a new object of the "dogs" class.
        // note that multiple objects can be instantiated, they just must have unique names.
        dogs dog1 = new dogs();
        dogs dog2 = new dogs();

        // as dog1 is an object of the class dog it will inherit all the attributes and methods from that class.
        // these methods or attributes can be accessed using the dot(.) operator.
        // eg: the birth year and vaccinated status of the dog1 object can be accessed as follows.
        System.out.println(dog1.birthYear);
        System.out.println(dog2.fullyVacinated);
        System.out.println(dog1.getBreed());
        // as the breed of the dog is saved as a private attribute in the dog class we can't use the dot operator
        // -to access it, instead we must use a getter or setter method.
        // a getter method returns the value of the attribute and the setter methods set the value 
        // -of an attribute to a new one.
        System.out.println(dog2.getBreed());

        System.out.println();

        // as the attributes are public we can access them in a different class using the dot operator
        // -and change the data stored in them. eg: below.
        dog1.birthYear = 2010;
        dog2.fullyVacinated = false;
        // as seen here the setter method is being used on a private attribute to change it's data.
        dog2.setBreed("German Shephard");

        System.out.println(dog1.birthYear);
        System.out.println(dog2.fullyVacinated);
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getBreed());

        System.out.println();

        // we can access and exectue the methods of a certain class the same way using the dot operator.
        dog1.bark();
        dog1.rollOver();

    }
}
