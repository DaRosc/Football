import java.util.Random;

public class Lineman extends Player {
    // @param name
    public Lineman (String name) {
        super(name);
        setOffenceBehavior(OBlockBehavior());
        Random rand = new Random();
        int rand_int = (rand.nextInt(2) + 1);
        if (rand_int == 1) {
            setDefenceBehavior(BlockBehavior());
        } else if (rand_int == 2) {
            setDefenceBehavior(StripBehavior());
        } else {
            setDefenceBehavior(SackBehavior());
        }
    }
    public void display() {
        //Displays the player's name
        System.out.println(name);
    }
}