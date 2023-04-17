package com.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallestElementToRight {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(nxtSmallestRight(arr)));
    }

    public static int[] nxtSmallestRight(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        ans[arr.length - 1] = -1;
        stack.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
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
