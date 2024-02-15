import java.util.Arrays;

public class Queue {
    public int[] arr;
    public int maxQueue;

    public Queue(int cap, int... args) {
        arr = args;
        maxQueue = cap;
    }

    public void enqueue(int num) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = num;
    }

    public void dequeue() {
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr = Arrays.copyOf(arr, arr.length - 1);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Queue is already empty");
        }
    }

    public void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int count() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public boolean isFull() {
        return arr.length == maxQueue;
    }

    public int peek(int index) {
        try {
            return arr[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
            return 0;
        }
    }

    public void change(int index, int num) {
        try {
            arr[index] = num;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
        }
    }
}
