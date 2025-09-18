package ds.stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void printNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack empty, no greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element to stack
            stack.push(arr[i]); // {4, 5, 2, 25};
        }

        // Print results
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        printNextGreater(arr);
    }
}


