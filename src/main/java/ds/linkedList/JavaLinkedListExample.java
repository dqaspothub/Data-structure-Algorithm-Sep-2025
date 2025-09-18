package ds.linkedList;


import java.util.*;

public class JavaLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("LinkedList: " + list);

        // Remove element
        list.remove("Banana");
        System.out.println("After removal: " + list);

        // Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}
