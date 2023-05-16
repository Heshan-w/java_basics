package OOP.inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Donald", "bird");
        Dog dog = new Dog("Riley", "mammal", "beagle");
        Lion lion = new Lion("Alex", "mammal", "Africa");

        animal.speak();
        System.out.println();
        System.out.println(animal.getType() + "\n");
        dog.speak();
        System.out.println();
        System.out.println(lion.getName() + "\n");
        System.out.println(lion.getType() + "\n");
        lion.speak();
    }

}
