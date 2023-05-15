package com.SlidingWindow;

public class minimumAverageDifference {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 9, 5, 3};
        System.out.println(minimumAverage(arr));
    }

    public static int minimumAverage(int[] arr) {
        int sum = 0, add = 0, compare = 0, idx = 0, min = Integer.MAX_VALUE;
        for (int i : arr) sum += i;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
            compare = Math.abs((add / (i + 1)) - (arr.length - i == 1 ? 0 : ((sum - add) / (arr.length - i - 1))));
            if (compare < min) {
                min = compare;
                idx = i;
            }
        }
        return idx;
    }
}
