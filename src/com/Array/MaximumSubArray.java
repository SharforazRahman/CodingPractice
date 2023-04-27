package com.Array;

//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;

        for (int j : arr) {
            sum += j;
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
