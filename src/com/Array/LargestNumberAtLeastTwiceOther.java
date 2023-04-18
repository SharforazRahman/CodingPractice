package com.Array;

public class LargestNumberAtLeastTwiceOther {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(dominantIndex(arr));
    }

    public static int dominantIndex(int[] arr) {
        int max = -1, idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        for (int i : arr) {
            if (i == max) continue;
            if (!(max >= i * 2)) return -1;
        }
        return idx;
    }
}
