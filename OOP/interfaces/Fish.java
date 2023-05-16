package OOP.interfaces;

public class Fish implements predator, Prey{
    // as the Fish class implements both predator and prey classes, there will be an overridden definition of the 
    // -methods defined in each of those classes(predator and prey classs as to this example).

    @Override
    public void flee() {
        System.out.println("The smaller fish flee from the larger fish");
    }

    @Override
    public void hunt() {
        System.out.println("The larger fish hunt the smaller fish");
    }

    @Override
    public void description() {
        System.out.println("A predator is an animal that eats other animals");
    }
    
}
