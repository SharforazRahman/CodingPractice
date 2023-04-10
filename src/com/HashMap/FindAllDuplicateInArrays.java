package com.HashMap;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicateInArrays {
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(a));
    }

    public static List<Integer> findDuplicates(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        for(int i : map.keySet()){
            if(map.get(i) > 1) list.add(i);
        }
        return list;
    }
}
