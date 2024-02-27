import java.util.Random;

public class Quick {
    static int[] sort(int[] arr) {
        return sort(arr, 0, arr.length - 1);
    }

    static int[] sort(int[] arr, int lower, int upper) {
        if (lower >= upper)
            return arr;

        int randomPivot = new Random().nextInt(upper - lower) + lower;
        int pivot = arr[randomPivot];
        swap(arr, randomPivot, upper);
        int left = lower;
        int right = upper;

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

        swap(arr, left, upper);

        sort(arr, lower, left - 1);
        sort(arr, left + 1, upper);

        return arr;
    }

    static private void swap(int[] arr, int indx1, int indx2) {
        int hold = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = hold;
    }
}
