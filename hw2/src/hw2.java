public class hw2 {
    public static void main(String[] args) throws Exception {
        // --------------------
        // Stack Demonstration
        // --------------------
        Stack stack = new Stack();
        System.out.println("STACK DEMONSTRATION");
        System.out.println();
        System.out.println("Adding:");
        System.out.println();

        stack.push(15);
        System.out.println(15);
        System.out.println();
        stack.push(25);
        System.out.println(25);
        System.out.println();
        stack.push(35);
        System.out.println(35);
        System.out.println();
        stack.push(45);
        System.out.println(45);
        System.out.println();
        stack.push(55);
        System.out.println(55);
        System.out.println();

        System.out.println("Top item:");
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();

        System.out.println("Removing:");
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();

        System.out.println("Removing:");
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();

        System.out.println("New top:");
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();

        System.out.println("Is Stack empty?");
        System.out.println();
        System.out.println(stack.isEmpty());

        // --------------------
        // Queue Demonstration
        // --------------------
        Queue queue = new Queue();
        System.out.println();
        System.out.println("QUEUE DEMONSTRATION");
        System.out.println();

        queue.enqueue(15);
        System.out.println("Adding:");
        System.out.println(queue.peek());
        System.out.println();
        queue.enqueue(25);
        System.out.println(25);
        System.out.println();
        queue.enqueue(35);
        System.out.println(35);
        System.out.println();
        queue.enqueue(45);
        System.out.println(45);
        System.out.println();
        queue.enqueue(55);
        System.out.println(55);
        System.out.println();
        System.out.println("Front item:");
        System.out.println();
        System.out.println(queue.peek());
        System.out.println();

        System.out.println("Removing:");
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println();

        System.out.println("Removing:");
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println();

        System.out.println("New front:");
        System.out.println();
        System.out.println(queue.peek());
        System.out.println();

        System.out.println("Is Queue empty?");
        System.out.println();
        System.out.println(queue.isEmpty());
    }
}
