package OOP.interfaces;

public class Rabbit implements Prey{
    // as the Rabbit class implements from the Prey class, there will be an overridden definition of the 
    // -method(s) defined in  that class(Prey class as to this example).

    @Override
    public void flee() {
        System.out.println("The rabbit flees");
    }

    @Override
    public void description() {
        System.out.println("A prey is an animal the predator eats");
    }
    
}
