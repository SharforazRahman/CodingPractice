package com.Array;

//https://leetcode.com/problems/maximum-ascending-subarray-sum/
public class MaximumAscendingSubArraySum {
    public static void main(String[] args) {
        int[] arr = {12, 17, 15, 13, 10, 11, 12};
        System.out.println(maxAscendingSum(arr));
    }

    public static int maxAscendingSum(int[] arr) {
        int max = arr[0], sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
