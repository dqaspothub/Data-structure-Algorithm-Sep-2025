package ds.stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverse(String input) {
        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}
