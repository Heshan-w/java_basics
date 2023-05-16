package OOP.abstraction;

public class Cat extends Animal {

    private String breed;
    private int age;

    public Cat(String group, String habitat, String breed, int age) {
        super(group, habitat);
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    // as this is a subclass of the superclass with a abstract method. that method should definitely be 
    // -implemented here in this subclass.
    @Override
    public void description() {
        System.out.println("\nBreed of cat : " + this.getBreed() + "\n" + "Age of cat : " + this.getAge() + "\n"
                + "Group : " + this.getGroup() + "\n" + "Habitat : " + this.getHabitat());
    }

}
