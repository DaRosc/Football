public class Receiver extends Player {
    // @param name
    public Receiver (String name) {
        super(name);
        setOffenceBehavior(ReceiverBehavior());
        setDefenceBehavior(null);
    }
    public void display() {
        //Display's the player's name
        System.out.println(name);
    }
}