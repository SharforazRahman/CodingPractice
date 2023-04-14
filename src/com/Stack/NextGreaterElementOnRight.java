package com.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementOnRight {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 9, 2, 6};
        System.out.println(Arrays.toString(nxtGreater(arr)));
    }
    public static int[] nxtGreater(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(arr.length - 1);
        res[res.length - 1] = -1;

        for(int i = arr.length - 2; i >= 0; i--){
            while (stack.size() > 0 && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()) res[i] = -1;
            else res[i] = stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}
