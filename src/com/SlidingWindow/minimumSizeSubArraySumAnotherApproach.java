package com.SlidingWindow;

public class minimumSizeSubArraySumAnotherApproach {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        System.out.println(minSubArray(arr,target));
    }

    public static int minSubArray(int[] arr, int k) {
        int sum = 0, start = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= k) {
                min = Math.min(min, i - start + 1);
                sum -= arr[start++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
