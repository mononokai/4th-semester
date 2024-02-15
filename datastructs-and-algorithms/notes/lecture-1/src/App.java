public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(10, 1, 2, 3, 4, 5);
        Stack stack2 = new Stack(1, 0);
        Queue queue = new Queue(10, 1, 2, 3, 4, 5);
        Queue queue2 = new Queue(1, 0);

        // stack.display();
        // System.out.println(stack.count());
        // stack.push(6);
        // stack.display();
        // stack.pop();
        // stack.display();
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.peek());
        // stack.change(2, 7);
        // stack.display();

        stack2.display();
        stack2.pop();
        stack2.display();
        // stack2.pop();
        stack2.peek(1);

        // queue.display();
        // queue.enqueue(6);
        // queue.display();
        // queue.dequeue();
        // queue.display();

    }
}
