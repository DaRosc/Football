import java.util.Random;

public class QuarterBack extends Player {
    //@param name
    public QuarterBack (String name) {
        super(name);
        Random rand = new Random();
        int rand_int = (rand.nextInt(1) + 1)  
        if (rand_int == 1) {
            setOffenceBehavior(RunBehavior());
        } else {
            setOffenceBehavior(PassBehavior());
        }
        setDefenceBehavior(null);
    }
    public void display() {
        //Displays the player's name
        System.out.println(name);
    }
}