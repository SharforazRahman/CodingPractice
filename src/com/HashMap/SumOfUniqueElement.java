package com.HashMap;
//https://leetcode.com/problems/sum-of-unique-elements/
import java.util.HashMap;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
        int sum = 0;

        for(int i : map.keySet()){
            if(map.get(i) == 1) sum+= i;
        }
        return sum;
    }
}
