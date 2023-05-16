package com.HashMap;
//https://leetcode.com/problems/optimal-partition-of-string/

import java.util.HashSet;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        int count = (s.isEmpty()) ? 0 : 1;
        HashSet<Character> set = new HashSet<>();

        for (char i : s.toCharArray()) {
            if (set.contains(i)) {
                set.clear();
                count++;
            }
            set.add(i);
        }
        return count;
    }
}
