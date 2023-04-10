package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

//https://leetcode.com/problems/kth-distinct-string-in-an-array/
public class KthDistinctStringInAnArray {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));
    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (String i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : arr) if (map.get(i) == 1) list.add(i);

        return list.size() < k ? "" : list.get(k - 1);
    }
}
