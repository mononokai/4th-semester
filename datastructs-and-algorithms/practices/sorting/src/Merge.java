public class Merge {
    public static int[] sort(int[] arr) {
        int len = arr.length;
        int mid = len / 2;

        // guard clause
        if (len < 2) return arr;

        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < len; i++) {
            right[i - mid] = arr[i];
        }

        sort(left);
        sort(right);

        merge(arr, left, right);

        return arr;
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftLen = left.length;
        int rightLen = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }

            k++;

        }

        while (i < leftLen) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < rightLen) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
