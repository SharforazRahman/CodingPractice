package com.Sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] arr) {
        int[] newArray = new int[arr.length];

        int idx = 0;
        for (int i : arr) {
            if (i % 2 == 0) newArray[idx++] = i;
        }

        int idx2 = idx;
        for (int i : arr) {
            if (i % 2 != 0) newArray[idx2++] = i;
        }

        return newArray;
    }
}
