import java.util.Random;

public class RNG {
    Random rng = new Random();

    public int rng(int maxNum) {
        return rng.nextInt(maxNum);
    }
}
