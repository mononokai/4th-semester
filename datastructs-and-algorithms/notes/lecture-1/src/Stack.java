import java.util.Arrays;

public class Stack {
    public int[] arr;
    public int maxStack;

    public Stack(int cap, int... args) {
        arr = args;
        maxStack = cap;
    }

    public int count() {
        return arr.length;
    }

    public void push(int num) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = num;
    }

    public int pop() {
        try {
            int top = arr[arr.length - 1];
            arr = Arrays.copyOf(arr, arr.length - 1);
            return top;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Stack is already empty.");
            return 0;
        }
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public boolean isFull() {
        return arr.length == maxStack;
    }

    public int peek(int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
            return 0;
        }
    }

    public void change(int index, int num) {
        try {
            arr[index] = num;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
        }
    }

    public void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
