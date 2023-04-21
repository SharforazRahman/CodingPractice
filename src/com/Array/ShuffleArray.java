package com.Array;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    public static int[] shuffle(int[] arr, int n) {
        int[] newArray = new int[2 * n];
        for (int i = 0, j = n, idx = 0; idx < newArray.length; i++, j++) {
            newArray[idx++] = arr[i];
            newArray[idx++] = arr[j];
        }
        return newArray;
    }
}
