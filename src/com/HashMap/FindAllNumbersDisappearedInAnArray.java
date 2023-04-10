package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : a) map.put(i, -1);
        for (int i = 1; i <= a.length; i++) {
            if (!map.containsKey(i)) list.add(i);
        }
        return list;
    }
}
