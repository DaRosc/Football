import java.util.Random;

public class PassBehavior implements OffenceBehavior {
    /* @return "throws a slant route"
     * @return "throws an out route"
     * @return "throws a seem route"
     * @return "throws a screen pass"
     * @return "throws a hail mary"
     */
    public String play() {
        Random rand = new Random();
        int rand_int = (rand.nextInt(4) + 1);
        if (rand_int == 1) {
            return "throws a slant route";
        } else if (rand_int == 2) {
            return "throws an out route";
        } else if (rand_int == 3) {
            return "throws a seem route";
        } else if (rand_int == 4) {
            return "throws a screen pass";
        } else {
            return "throws a hail mary";
        }
    }
}