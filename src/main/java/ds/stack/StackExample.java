package ds.stack;


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        // Push elements onto the stack
        books.push("Java Basics");
        books.push("OOP Concepts");
        books.push("Data Structures");

        System.out.println("Top of the stack: " + books.peek()); // Data Structures

        // Pop element from the stack
        String removedBook = books.pop();
        System.out.println("Removed: " + removedBook); // Data Structures

        // Check if stack is empty
        System.out.println("Is stack empty? " + books.isEmpty()); // false

        // Print remaining stack
        System.out.println("Current Stack: " + books); // [Java Basics, OOP Concepts]
    }
}
