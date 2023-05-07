package com.HashMap;
//https://leetcode.com/problems/find-the-difference-of-two-arrays/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4, 6};
        System.out.println(findDifference(arr1, arr2));
    }

    public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) set1.add(num);
        for (int num : arr2) set2.add(num);

        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        resultList.add(new ArrayList<>());

        for (int i : set1) {
            if (!set2.contains(i)) resultList.get(0).add(i);
        }

        for (int num : set2) {
            if (!set1.contains(num)) resultList.get(1).add(num);
        }
        return resultList;
    }
}
