import java.util.Random;

public class RunBehavior implements OffenceBehavior {
    /* @return "runs a drive"
     * @return "runs a draw"
     * @return "runs a pitch"
     * @return "runs a reverse"
     */
    public String play() {
        Random rand = new Random();
        int rand_int = (rand.nextInt(3) + 1);
        if (rand_int == 1) {
            return "runs a drive";
        } else if (rand_int == 2) {
            return "runs a draw";
        } else if (rand_int == 3) {
            return "runs a pitch";
        } else {
            return "runs a reverse";
        }
    }
}