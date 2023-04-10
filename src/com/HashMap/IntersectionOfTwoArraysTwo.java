package com.HashMap;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
import java.util.*;

public class IntersectionOfTwoArraysTwo {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2};
        System.out.println(Arrays.toString(intersect(a, b)));
    }

    public static int[] intersect(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : b) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : a) {
            if (map.containsKey(i)) {
                if (set.add(i)) list.add(i);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}
