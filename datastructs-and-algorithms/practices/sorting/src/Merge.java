import java.util.Arrays;

public class Merge {
    public static void sort(int[] arr) {
        int len = arr.length;
        int mid = len / 2;

        // guard clause
        if (len < 2) return;

        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < len; i++) {
            
        }

        return;
    }

    private int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];

        return arr;
    }
}
