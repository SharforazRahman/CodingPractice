package com.HashMap;
//https://leetcode.com/problems/find-lucky-integer-in-an-array/
import java.util.Arrays;
import java.util.HashMap;

public class findLuckyIntegerInArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println(findLuckyInteger(arr));
    }

    public static int findLuckyInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.containsKey(arr[i]) && map.get(arr[i]) == arr[i]) return arr[i];
        }
        return -1;
    }
}
