package com.Sorting;

import java.util.Arrays;
import java.util.Map;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] arr) {
        Arrays.sort(arr);
        String[] res = Arrays.copyOf(new String[]{"" + Arrays.toString(arr)}, arr.length);
        res[arr.length - 1] = "Gold Medal";
        res[arr.length - 2] = "Silver Medal";
        res[arr.length - 3] = "Bronze Medal";

        for (int i = 0; i < arr.length; i++) {
            res[i] = (i + 1) + "";
        }
        System.out.println(Math.ceil(10/3));
        return res;
    }
}
