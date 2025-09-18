package ds.queue;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue - Adding elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Queue: " + queue);

        // Peek - Checking the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue - Removing elements
        String removed = queue.poll();
        System.out.println("Removed: " + removed);
        System.out.println("Queue after removal: " + queue);

        // Checking size
        System.out.println("Queue size: " + queue.size());

        // Checking if empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
