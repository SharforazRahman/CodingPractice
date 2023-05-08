package com.HashMap;
//https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/
import java.util.HashSet;
import java.util.Set;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public static void main(String[] args) {
        int[] arr = {1, 13, 10, 12, 31};
        System.out.println(countDistinctIntegers(arr));
    }

    public static int countDistinctIntegers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();

        for(int i : arr) set.add(i);
        for(int i : arr){
            while (i != 0){
                int reminder = i % 10;
                sb.append(reminder);
                i /= 10;
            }
            set.add(Integer.parseInt(sb.toString()));
            sb = new StringBuilder();
        }
        return set.size();
    }
}