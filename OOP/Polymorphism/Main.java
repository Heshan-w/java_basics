package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // polymorphysim is the ability of an object to identify as more than one type

        MHeats Heats = new MHeats();
        GSWarriors GSW = new GSWarriors();
        LLakers Lakers = new LLakers();

        // we know an array should be of the same data type, yet the three objects stored in the "teams" array
        // are from 3 separate classes, having 3 diff data types.
        // we must note that all of those three classes are subclasses of the parent class "NBAteams", hence
        // they all have the common data type of "NBAteams" in them...by using polymorphysim we can then create an 
        // array of type "NBAteams" and save those three objects.
        NBAteams[] teams = {Heats, GSW, Lakers};

        // if we needed to access the "pointGuard" method for each class we made an object from we can
        // do it as such.
        // in the FOR loop we set up a variable of type NBAteams to access each element in the teams array
        // in this case the variable is "x".
        for(NBAteams x: teams) {
            x.pointGuard();
        }
    }
    
}
