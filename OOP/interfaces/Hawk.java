package OOP.interfaces;

public class Hawk implements predator{
    // as the Hawk class implements from the Predator class, there will be an overridden definition of the 
    // -method(s) defined in that class(Predator class as to this example).

    @Override
    public void hunt() {
        System.out.println("the hawk hunts");
    }

    @Override
    public void description() {
        System.out.println("A predator is an animal that eats other animals");
    }
    
}
