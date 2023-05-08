package com.SlidingWindow;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(findMaxAverage(arr,k));
    }
    public static int findMaxAverage(int[] a, int k) {
        int i = 0, j = 0, max = 0, sum = 0;
        while (j < a.length){
            sum += a[j];
            if((j - i + 1) < k) j++;
            else if((j - i + 1) == k){
                max = Math.max(max,sum);
                sum -= a[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
