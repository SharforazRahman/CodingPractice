package com.HashMap;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1};
        System.out.println(findMaxLength(arr));
    }

    public static int findMaxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count += -1;
            else count += 1;
            if (map.containsKey(count)) {
                int ele = i - map.get(count);
                max = Math.max(max, ele);
            } else map.put(count, i);
        }
        return max;
    }
}

