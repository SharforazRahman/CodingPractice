package com.HashMap;
//https://leetcode.com/problems/two-out-of-three/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] a = {1, 1, 3, 2};
        int[] b = {2, 3};
        int[] c = {3};
    }

    public static List<Integer> twoOutOfThree(int[] a, int[] b, int[] c) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i : a) set.add(i);
        for (int i : set) map.put(i, map.getOrDefault(i, 0) + 1);

        set.clear();
        for (int i : b) set.add(i);
        for (int i : set) map.put(i, map.getOrDefault(i, 0) + 1);

        set.clear();
        for (int i : c) set.add(i);
        for (int i : set) map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) >= 2) list.add(i);
        }
        return list;
    }
}
