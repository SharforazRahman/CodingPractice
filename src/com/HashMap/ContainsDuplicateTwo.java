package com.HashMap;

import java.util.HashMap;

public class ContainsDuplicateTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr,k));
    }

    public static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && i - map.get(arr[i]) <= k) return true;
            else map.put(arr[i], i);
        }
        return false;
    }
}
