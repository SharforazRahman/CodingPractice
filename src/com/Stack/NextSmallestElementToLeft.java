package com.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallestElementToLeft {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(nxtSmallest(arr)));
    }

    public static int[] nxtSmallest(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        ans[0] = -1;
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] < stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
