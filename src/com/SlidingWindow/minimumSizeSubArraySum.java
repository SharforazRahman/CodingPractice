package com.SlidingWindow;

public class minimumSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int k, int[] arr) {
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < arr.length) {
            sum += arr[j];
            if (sum < k) j++;
            else if (sum == k) {
                min = Math.min(min, (j - i + 1));
                j++;
            } else {
                while (sum >= k) {
                    sum -= arr[i];
                    i++;
                    if (sum == k) {
                        min = Math.min(min, (j - i + 1));
                    }
                }
                j++;
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}
