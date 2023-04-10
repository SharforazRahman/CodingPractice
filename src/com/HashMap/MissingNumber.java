package com.HashMap;
//https://leetcode.com/problems/missing-number/
import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] a) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : a) map.put(i,i);
        for(int i = 1; i <= a.length; i++){
            if(!map.containsKey(i)) return i;
        }
        return -1;
    }
}
