package ds.stack;

import java.util.Stack;

public class BaseBall {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                // Invalidate last score
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (op.equals("D")) {
                // Double last score
                if (!stack.isEmpty()) {
                    stack.push(stack.peek() * 2);
                }
            } else if (op.equals("+")) {
                // Sum of last two scores
                if (stack.size() >= 2) {
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    int sum = last + secondLast;
                    stack.push(last);   // restore last
                    stack.push(sum);    // push new sum
                } else if (stack.size() == 1) {
                    // Edge case: if only one score exists
                    stack.push(stack.peek());
                }
            } else {
                // Numeric score
                stack.push(Integer.parseInt(op));
            }
        }

        // Sum all valid scores
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        return total;
    }

    // For quick testing
    public static void main(String[] args) {
        BaseBall sol = new BaseBall();
        String[] ops = {"5","2","C","D","+"};
        System.out.println(sol.calPoints(ops));  // Output: 30
    }
}
