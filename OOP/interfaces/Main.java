package OOP.interfaces;

public class Main {
    public static void main(String[] args) {
        // classes of type "interface" cannot be instantiated...(Prey and Predator in this case)

        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();


        // once the classes are instantiated, their methods can be called.
        hawk.hunt();
        rabbit.flee();
        fish.hunt();
        fish.flee();

        hawk.description();
        rabbit.description();
    }
    
}
