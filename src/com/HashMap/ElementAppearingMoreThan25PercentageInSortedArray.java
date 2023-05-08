package com.HashMap;

import java.util.HashMap;

public class ElementAppearingMoreThan25PercentageInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, result = 0;
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : map.keySet()) {
            if (max < map.get(i)) {
                max = map.get(i);
                result = i;
            }
        }
        return result;
    }
}
