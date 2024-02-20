public class Bubble {
    static int[] sort(int[] arr) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                    sorted = false;
                }
            }
        }

        return arr;
    }
}
