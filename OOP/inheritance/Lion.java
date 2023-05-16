package OOP.inheritance;

public class Lion extends Animal {

    // the subclass can have its own unique attributes as well apart from the ones it inherits from the superclass.
    private String birthPlace;

    public Lion(String name, String type, String birthPlace) {
        // the super keyword is used when the superclass the subclass is inheriting from has a constructor.
        // this super method automatically inherits the constructor of the superclass to the subclass concisely.   
        super(name, type);
        this.birthPlace = birthPlace;
    }

    // the subclass can have its own unique methods as well apart from the ones it inherits from the superclass.
    public String getBirthPlace() {
        return this.birthPlace;
    }

    @Override
    public void speak() {
        // we can also use "super" in this way,
        // where we have a method in the subclass that overrides a method in the superclass. yet we still want
        // -the implementation of the superclass method in the subclass method call as well.
        // hence we can type "super." and the name of the method that is overridden to call its superclass implementation 
        super.speak();
        // after that, if we want we can even have a new implementation of the method be executed.
        System.out.println(".....the lion " + this.getName() + ", from " + this.getBirthPlace() + ", who is a "
                + this.getType() + " roars");
    }

}
