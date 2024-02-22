public class Quick {
    static int[] sort(int[] arr, int lower, int upper) {
        int pivot = arr[upper];
        int left = lower;
        int right = upper;

        if (lower >= upper) return arr;

        while (left < right) {
            while (arr[left] <= pivot && left < right) {
                left++;
            }

            while (arr[right] >= pivot && left < right) {
                right--;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        int temp = arr[left];
        arr[left] = arr[upper];
        arr[upper] = temp;

        sort(arr, lower, left - 1);
        sort(arr, left + 1, upper);

        return arr;
    }
}
