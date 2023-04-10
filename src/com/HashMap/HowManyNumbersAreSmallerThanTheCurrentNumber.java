package com.HashMap;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = a.clone();
        Arrays.sort(arr);

        for(int i = 0; i < a.length; i++){
            map.putIfAbsent(arr[i],i);
        }
        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])) arr[i] = map.get(a[i]);
        }
        return arr;
    }
}
