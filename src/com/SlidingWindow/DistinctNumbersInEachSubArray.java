package com.SlidingWindow;
//https://leetcode.ca/all/1852.html#:~:text=Given%20an%20integer%20array%20nums,Return%20the%20array%20ans%20.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumbersInEachSubArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,3,4};
        int k = 4;
        System.out.println(Arrays.toString(distinctNumbers(arr, k)));
    }

    public static Object[] distinctNumbers(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, count = 0;

        while (j < arr.length) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            if ((j - i + 1) < k) j++;
            else if ((j - i + 1) == k) {
                for(int val : map.keySet()) count++;
                int key = arr[i];
                int freq = map.get(key);
                map.put(key,freq - 1);
                list.add(count);
                if(map.get(key) == 0) map.remove(arr[i]);
                i++;
                j++;
                count = 0;
            }
        }
        return list.toArray();
    }
}