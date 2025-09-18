package ds.queue;

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.addFirst("Front");
        dq.addLast("Rear");
        dq.addLast("Middle");

        System.out.println("Deque: " + dq);

        dq.removeFirst();
        dq.removeLast();
        System.out.println("After removals: " + dq);
    }
}
