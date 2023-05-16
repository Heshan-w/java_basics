package OOP.inheritance;

public class Dog extends Animal {

    // the subclass can have its own unique attributes as well apart from the ones it inherits from the superclass.
    private String breed;

    public Dog(String name, String type, String breed) {
        // the super keyword is used when the superclass the subclass is inheriting from has a constructor.
        // this super method automatically inherits the constructor of the superclass to the subclass concisely. 
        super(name, type);
        this.breed = breed;
    }

    // the subclass can have its own unique methods as well apart from the ones it inherits from the superclass.
    public String getBreed() {
        return this.breed;
    }

    @Override
    public void speak() {
        System.out.println(
                "the dog " + this.getName() + ", a " + this.getBreed() + ", who is a " + this.getType() + " barks");
    }

}
