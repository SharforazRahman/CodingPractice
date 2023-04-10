package com.HashMap;
//https://leetcode.com/problems/find-the-difference/

import java.util.HashMap;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "", t = "g";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        for (char i : t.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);

        for (char i : map.keySet()) {
            if (map.get(i) == 1) return i;
        }
        return ' ';
    }
}
