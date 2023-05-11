package com.HashMap;
//https://leetcode.com/problems/single-number-iii/

import java.util.Arrays;
import java.util.HashMap;

public class singleNumberThree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(arr)));
    }

    public static int[] singleNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        int idx = 0;
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) == 1) ans[idx++] = i;
        }
        return ans;
    }
}
