package com.SlidingWindow;

//https://leetcode.com/problems/maximum-average-subarray-i/
public class MaximumAverageSubArrayOne {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(arr, k));
    }

    public static double findMaxAverage(int[] a, int k) {
        int i = 0, j = 0;
        double sum = 0.0, max = Integer.MIN_VALUE;

        while (j < a.length) {
            sum += a[j];
            if ((j - i + 1) < k) j++;
            else if ((j - i + 1) == k) {
                max = Math.max(max, sum);
                sum -= a[i];
                i++;
                j++;
            }
        }
        return max / k;
    }
}
