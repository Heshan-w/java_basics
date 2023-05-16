package OOP.abstraction;

public abstract class Animal {

    private String group;
    private String habitat;

    public Animal(String group, String habitat) {
        this.group = group;
        this.habitat = habitat;
    }

    public String getGroup() {
        return this.group;
    }

    public String getHabitat() {
        return this.habitat;
    }

    // as the method is abstract there is no body.
    public abstract void description();

}
