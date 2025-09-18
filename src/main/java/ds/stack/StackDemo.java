package ds.stack;

import java.util.Stack;

public class StackDemo {

        public static void main(String[] args) {
            // Create a stack of integers
            Stack<Integer> stack = new Stack<>();

            // Check if stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());

            // Push elements onto stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            System.out.println("Stack elements: " + stack);

            // Peek at the top element
            System.out.println("Top element (peek): " + stack.peek());

            // Pop element (removes last inserted element)
            System.out.println("Popped element: " + stack.pop());

            // Display stack after pop
            System.out.println("Stack after pop: " + stack);

            // Search element
            int position = stack.search(50);

            System.out.println("The position of the given value " + position);

            if (position != -1) {
                System.out.println("Element 20 found at position: " + position);
            } else {
                System.out.println("Element not found.");
            }

            // Check if stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());
        }
    }

