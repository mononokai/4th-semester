import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 5, 1, 4, 2, 8 };

        int[] bubbleSorted = Bubble.sort(arr);
        System.out.println(Arrays.toString(bubbleSorted));
    }
}
