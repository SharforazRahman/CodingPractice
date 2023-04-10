package com.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int[] res = new int[arr1.length];

        for (int i : arr1) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : arr2) {
            int occurrence = map.get(i);
            if (map.containsKey(i)) {
                for (int j = 0; j < occurrence; j++) {
                    list.add(i);
                }
            } else list2.add(i);
        }
        System.out.println(list);
        System.out.println(list2);
        return arr1;
    }
}
