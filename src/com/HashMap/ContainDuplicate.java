package com.HashMap;

import java.util.HashMap;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        System.out.println(containsDuplicate(a));
    }

    public static boolean containsDuplicate(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : map.values()) {
            if (i > 1) return true;
        }
        return false;
    }
}
