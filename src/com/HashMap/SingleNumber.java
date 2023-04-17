package com.HashMap;

import java.util.HashMap;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[] args) {
        int[] num = {2,2, 1};
        System.out.println(singleNumber(num));
    }

    public static int singleNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) == 1) return i;
        }
        return -1;
    }
}
