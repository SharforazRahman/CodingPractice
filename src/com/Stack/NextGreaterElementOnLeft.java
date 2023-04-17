package com.Stack;
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/stacks/next-greater-element-left-official/ojquestion

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementOnLeft {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        System.out.println(Arrays.toString(nxtGreaterLeft(arr)));
    }

    public static int[] nxtGreaterLeft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        ans[0] = -1;
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] > stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.add(arr[i]);
        }
        return ans;
    }
}
