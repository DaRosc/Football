public abstract class Player {
    protected String name;
    boolean defence;
    OffenceBehavior offenceBehavior;
    DefenceBehavior defenceBehavior;
    // @param name
    public Player (String name) {
        this.name = name;
    }
    // @param newBehavior
    public void setOffenceBehavior (OffenceBehavior newBehavior) {
        offenceBehavior = newBehavior;
    }
    // @param newBehavior
    public void setDefenceBehavior (DefenceBehavior newBehavior) {
        defenceBehavior = newBehavior;
    }
    //Runs the play method on the offence and defence behaviors
    public String play() {
        if (defence == true) {
            defenceBehavior.play();
        } else {
            offenceBehavior.play();
        }
    }
    //Flips the current behavior
    public void turnover() {
        if (defence == true) {
            defence = false;
        } else if (defence == false) {
            defence = true;
        }
    }
}