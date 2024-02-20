public class Insertion {
    static int[] sort(int[] arr) {
        int[] res = arr;

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int j = i - 1;

            while (arr[j] > num && j >= 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = num;
        }

        return res;
    }
}
