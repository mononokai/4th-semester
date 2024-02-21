import java.util.Arrays;

public class Merge {
    static int[] sort(int[] arr) {
        int mid = arr.length / 2;

        int[] chunk = Arrays.copyOfRange(arr, 0, mid);

        int[] res = merge(sort(chunk), sort(arr));

        return arr;
    }

    private int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];

        

        return arr;
    }
}
