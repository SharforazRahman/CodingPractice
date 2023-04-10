package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumB(a, target)));
    }

    public static int[] twoSumB(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int present = target - arr[i];
            if (map.containsKey(present)) {
                return new int[]{map.get(present), i};
            } else map.put(arr[i], i);
        }
        throw new IllegalArgumentException("Not a Valid Sum");
    }
}
