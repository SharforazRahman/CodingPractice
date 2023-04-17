package com.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(stock(arr)));
    }
    public static int[] stock(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        stack.push(0);
        ans[0] = 1;

        for(int i = 1; i < arr.length; i++){
            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = i + 1;
            }else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
