package ds.queue;

import java.util.*;

class BankQueue {
    public static void main(String[] args) {
        Queue<String> bankQueue = new LinkedList<>();

        // Customers arrive
        bankQueue.add("Customer1");
        bankQueue.add("Customer2");
        bankQueue.add("Customer3");

        System.out.println("Bank Queue: " + bankQueue);

        // Serving customers
        while (!bankQueue.isEmpty()) {
            String customer = bankQueue.poll(); // Dequeue
            System.out.println("Serving: " + customer);
        }

        System.out.println("All customers served. Queue empty: " + bankQueue.isEmpty());
    }
}
