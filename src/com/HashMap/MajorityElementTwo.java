package com.HashMap;
//https://leetcode.com/problems/majority-element-ii/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementTwo {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : map.keySet()) {
            if (map.get(i) > a.length / 3) list.add(i);
        }
        return list;
    }
}
