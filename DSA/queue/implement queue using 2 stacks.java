Implement queue using stacks.

Take 2 stacks st1 and st2 .   st1 is the main stack

Steps: 1 -> move st1 value to st2.

Step 2: push value to st1.

Step 3: move st2 value to st1.

Code:

import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue (costly operation)
    public void enqueue(int val) {
        // Step 1: Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Step 2: Push new element into s1
        s1.push(val);

        // Step 3: Move all elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue
    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    // Peek front element
    public int peek() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return s1.isEmpty();
    }

    // Display the queue
    public void display() {
        System.out.println("Queue: " + s1);
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();             // [10, 20, 30]
        System.out.println(queue.dequeue()); // 10
        queue.display();             // [20, 30]
        System.out.println(queue.peek());    // 20
    }
}
