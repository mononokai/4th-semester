public class Linear {
    public static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }
}
