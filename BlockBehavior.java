import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
    /* @return "blocks a kick"
     * @return "blocks a punt"
     * @return "blocks a pass"
     * @return "blocks a catch"
     */
    public String play() {
        Random rand = new Random();
        int rand_int = (rand.nextInt(3) + 1);
        if (rand_int == 1) {
            return "blocks a kick";
        } else if (rand_int == 2) {
            return "blocks a punt";
        } else if (rand_int == 3) {
            return "blocks a pass";
        } else {
            return "blocks a catch";
        }
    }
}