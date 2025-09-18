package ds.queue;
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap (default)
        pq.add(30);
        pq.add(10);
        pq.add(50);

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}
