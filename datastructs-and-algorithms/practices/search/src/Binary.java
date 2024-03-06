public class Binary {
    public static int search(int[] arr, int num) {
        int lower = 0;
        int upper = arr.length - 1;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            int val = arr[mid];

            if (val < num) lower = mid + 1;
            else if (val > num) upper = mid - 1;
            else return mid;
        }

        return -1;
    }
}
