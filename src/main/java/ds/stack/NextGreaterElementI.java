package ds.stack;


import java.util.*;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store next greater for each number in nums2
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Process nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            // Remove all smaller elements
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            // If stack empty -> no greater element
            nextGreaterMap.put(num, stack.isEmpty() ? -1 : stack.peek());

            // Push current element
            stack.push(num);
        }

        // Build result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementI solution = new NextGreaterElementI();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};


        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result)); // [-1, 3, -1]
    }
}
