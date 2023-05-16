package OOP.constructors;

public class constructors {
    public static void main(String[] args) {
        humans Human1 = new humans("John", "male", 1998, "mechanic");

        System.out.println(Human1.getName());
        System.out.println(Human1.getGender());
        System.out.println(Human1.getBirthYear());
        System.out.println(Human1.getOccupation());
        System.out.println(Human1.getMarraigeStatus());

        Human1.description();

        Human1.setName("Oliver");
        Human1.setGender("female");
        Human1.setOccupation("doctor");
        Human1.setMarraigeStatus(true);

        System.out.println(Human1.getMarraigeStatus());

        Human1.description();
    }
}
