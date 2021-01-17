import java.util.Random;

public class ReceiveBehavior implements OffenceBehavior {
    public String play() {
        /* @return "runs a slant route"
         * @return "runs an out route"
         * @return "runs a seem route"
         * @return "runs a screen pass"
         * @return "runs a hail mary"
         */
        Random rand = new Random();
        int rand_int = (rand.nextInt(4) + 1);
        if (rand_int == 1) {
            return "runs a slant route";
        } else if (rand_int == 2) {
            return "runs an out route";
        } else if (rand_int == 3) {
            return "runs a seem route";
        } else if (rand_int == 4) {
            return "runs a screen pass";
        } else {
            return "runs a hail mary";
        }
    }
}